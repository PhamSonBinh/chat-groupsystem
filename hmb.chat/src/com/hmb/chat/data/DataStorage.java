package com.hmb.chat.data;

import com.hmb.chat.entity.*;
import com.hmb.chat.entity.User;
import com.hmb.chat.repository.Repository;

public abstract class DataStorage {
	protected Repository<User> users;
	protected Repository<Group> groups;
	protected Repository<Message> messages;

	public Repository<User> getUsers() {
		return users;
	}
	
	public Repository<Group> getGroups() {
		return groups;
	}
	
	public Repository<Message> getMessages() {
		return messages;
	}
}
