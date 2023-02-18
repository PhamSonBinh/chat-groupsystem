package com.hmb.chat.repository;

import java.util.List;

import com.hmb.chat.Database;
import com.hmb.chat.entity.User;

public abstract class UserRepository implements Repository<User> {

	private static List<User> storage;

	public UserRepository() {
		UserRepository.storage = Database.getInstance().getUserList();
	}

	@Override
	public void add(User user) {
		storage.add(user);
	}

	@Override
	public void delete(String id) {

	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public User getElement(String id) {
		return null;
	}

	@Override
	public boolean exist(String id) {

		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getAll() {

		return storage;
	}

}
