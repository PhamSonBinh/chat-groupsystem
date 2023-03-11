package com.hmb.chat.Service;

import java.util.List;

import com.hmb.chat.data.DataStorage;
import com.hmb.chat.data.InMemoryDataStorage;
import com.hmb.chat.entity.Group;
import com.hmb.chat.entity.PrivateGroup;
import com.hmb.chat.entity.PublicGroup;
import com.hmb.chat.entity.User;
import com.hmb.chat.repository.Repository;

public class GroupService {
	private final DataStorage storage;
	private String groupType;
	private String groupName;
	private List<PublicGroup> listPublicGroup;
	private List<PrivateGroup> listPrivateGroup;
	public GroupService(DataStorage storage) {
		this.storage = storage;
	}
	public GroupService(DataStorage storage, String groupType, String groupName) {
		super();
		this.storage = storage;
		this.groupType = groupType;
		this.groupName = groupName;
	}
	public Group createGroup(User user, String groupType) {
//		Repository<Group> groupRepository = storage.getGroups();
		Group group = null;
		if (groupType.equals("public")) {
			PublicGroup newPublicGroup = new PublicGroup(user, groupName);
			
			listPublicGroup.add(newPublicGroup);
			group = newPublicGroup;
		} else if (groupType.equals("private")) {
			PrivateGroup privateGroup = new PrivateGroup(user, groupName);
			group = privateGroup;
		}
		storage.getGroups().insert(group);
		return group;
	}
	public boolean  RemoveUserFromGroup(int userId, int groupId) {
		Group existGroup = storage.getGroups().getFirst(group -> group.getId() == groupId);
		User existUser = storage.getUsers().getFirst(user -> user.getId() == userId);
		if (existGroup != null && existUser != null) {
			existGroup.deleteUser(userId);
			return true;
		}
		return false;	
	}
	public boolean addUser(String username, String password) {
		User existing = storage.getUsers().getFirst(user -> user.getUserName().equals(username));
		if (existing != null) {
			return false;
		}

		User newUser = new User(username, password);
		storage.getUsers().insert(newUser);
		return true;
	}
}
	