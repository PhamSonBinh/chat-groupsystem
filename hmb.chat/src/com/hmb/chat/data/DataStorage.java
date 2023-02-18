package com.hmb.chat.data;

import com.hmb.chat.entity.User;
import com.hmb.chat.repository.GroupRepository;
import com.hmb.chat.repository.Repository;
import com.hmb.chat.repository.UserRepository;

public class DataStorage {
	protected Repository<User> users;
	protected GroupRepository groups;
	
	public Repository<User> getUsers() {
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
