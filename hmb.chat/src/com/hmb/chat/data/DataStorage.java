package com.hmb.chat.data;

import com.hmb.chat.entity.User;
import com.hmb.chat.model.Group;
import com.hmb.chat.repository.GroupRepository;
import com.hmb.chat.repository.IRepository;
import com.hmb.chat.repository.UserRepository;

public class DataStorage {
	protected UserRepository users;
	protected GroupRepository groups;
	
	public UserRepository getUsers() {
		return users;
	}
	protected void setUsers(UserRepository users) {
		this.users = users;
	}
	public GroupRepository getGroups() {
		return groups;
	}
	protected void setGroups(GroupRepository groups) {
		this.groups = groups;
	}
    
}
