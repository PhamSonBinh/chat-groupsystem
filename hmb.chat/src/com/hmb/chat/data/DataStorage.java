package com.hmb.chat.data;

import com.hmb.chat.Group;
import com.hmb.chat.User;
import com.hmb.chat.repository.IRepository;

public abstract class DataStorage {
	protected IRepository<User> users;
	protected IRepository<Group> groups;
	public IRepository<User> getUsers() {
		return users;
	}
	protected void setUsers(IRepository<User> users) {
		this.users = users;
	}
	public IRepository<Group> getGroups() {
		return groups;
	}
	protected void setGroups(IRepository<Group> groups) {
		this.groups = groups;
	}
    
}
