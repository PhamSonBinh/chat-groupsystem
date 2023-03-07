package com.hmb.chat.Service;

import com.hmb.chat.data.DataStorage;
import com.hmb.chat.data.InMemoryDataStorage;
import com.hmb.chat.entity.Group;
import com.hmb.chat.entity.User;

public class GroupService {
	private final DataStorage storage;

	public GroupService(DataStorage storage) {
		this.storage = storage;
	}

	public boolean  RemoveUserFromGroup(User userId, int groupId) {
		Group existing = storage.getGroups().getFirst(group -> group.getId() == groupId);
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