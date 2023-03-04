package com.hmb.chat.data;

import com.hmb.chat.entity.Group;
import com.hmb.chat.entity.User;
import com.hmb.chat.repository.Repository;

public abstract class DataStorage {
	protected Repository<User> users;
	protected Repository<Group> groups;

	public Repository<User> getUsers() {
		return users;
	}
	
	public Repository<Group> getGroups() {
		return groups;
	}
}
