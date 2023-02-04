package com.hmb.chat.repository;

import java.util.ArrayList;

import com.hmb.chat.entity.User;

public class UserRepository implements IRepository<User> {

	private ArrayList<User> users;
	
	public UserRepository(ArrayList<User> users) {
		this.users = users;
	}
	public UserRepository() {
		users = new ArrayList<>();
	}
	@Override
	public void add(User entity) {
		users.add(entity);
	}

	@Override
	public void delete(String id) {
		
	}

	@Override
	public void update(User entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exist(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
