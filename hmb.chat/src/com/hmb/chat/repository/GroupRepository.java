package com.hmb.chat.repository;

import java.util.ArrayList;

import com.hmb.chat.Group;


public class GroupRepository implements IRepository<Group> {


	private ArrayList<Group> groups;
	public GroupRepository(ArrayList<Group> groups) {
		this.groups = groups;
	}
	public GroupRepository() {
		groups = new ArrayList<>();
	}
	@Override
	public void add(Group entity) {
		groups.add(entity);
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Group entity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Group get(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean exist(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
