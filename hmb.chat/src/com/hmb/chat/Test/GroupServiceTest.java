package com.hmb.chat.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hmb.chat.Service.GroupService;
import com.hmb.chat.data.DataStorage;
import com.hmb.chat.data.InMemoryDataStorage;
import com.hmb.chat.entity.Group;
import com.hmb.chat.entity.PublicGroup;
import com.hmb.chat.entity.User;

public class GroupServiceTest {
	private GroupService groupService;
	private DataStorage storage;

	@Before
	public void setUp() {
		storage = InMemoryDataStorage.GetInStance();
		groupService = new GroupService(storage);

	}

	@Test
	public void createGroup() {
		User user1 = new User("hieu", "123");
		storage.getUsers().insert(user1);
		Group group1 = new PublicGroup(user1 ,"group1");
		storage.getGroups().insert(group1);
		
		int n = storage.getGroups().getAll().size();
		System.out.println(n);
	}

}
