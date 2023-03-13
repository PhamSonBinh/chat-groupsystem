package com.hmb.chat.Service;

import com.hmb.chat.data.DataStorage;
import com.hmb.chat.entity.User;

public class UserService {
	private final DataStorage storage;

	public UserService(DataStorage storage) {
        this.storage = storage;
    }

	public boolean login(String username, String password) {
		User attemptedUser = storage.getUsers().getFirst(user -> user.getUserName().equals(username));
		if (attemptedUser == null) {
			return false;
		}
		return attemptedUser.login(password);
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
	public boolean addUserID(String username, String password, int id) {
		User existing = storage.getUsers().getFirst(user -> user.getUserName().equals(username));
		if (existing != null) {
			return false;
		}

		User newUser = new User(username, password, id);
		storage.getUsers().insert(newUser);
		return true;
	}
}