package com.hmb.chat.repository;
import java.util.List;
import java.util.function.Predicate;

import com.hmb.chat.Database;
import com.hmb.chat.entity.Group;


public class GroupRepository implements Repository<Group> {
	private List<Group> storage;

	public GroupRepository() {
		storage = Database.getInstance().getGroupList();
	}
	@Override
	public void add(Group group) {
		storage.add(group);
		
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
	public boolean exist(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public List getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Group getElement(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Group getFirst(Predicate<Group> predicate) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
