package com.hmb.chat.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hmb.chat.Service.UserService;
import com.hmb.chat.data.DataStorage;
import com.hmb.chat.data.InMemoryDataStorage;
import com.hmb.chat.entity.User;
import com.hmb.chat.repository.InMemoryRepository;

public class UserServiceTest {
	private UserService userService;
	private DataStorage storage;

	@Before
	public void setUp() {
		storage = InMemoryDataStorage.GetInStance();
		userService = new UserService(storage);
	}

	@Test
	public void testAddUser() {
		boolean isSuccess = userService.addUser("binh", "1234");
		assertTrue(isSuccess);
	}

	@Test
	public void testAddUserFail() {
		User user1 = new User("hieu", "123");
		storage.getUsers().insert(user1);

		boolean isFail = userService.addUser("hieu", "123");
		assertFalse(isFail);
	}

	@Test
	public void testLogin() {
		boolean isSuccess = userService.login("hieu", "123");
		assertTrue(isSuccess);
	}

	@Test
	public void testLoginFail() {
		boolean isFail = userService.login("hieu", "12123");
		assertFalse(isFail);
	}
	
	@Test
	public void getID() {
		User user = new User("hieu", "123");
		storage.getUsers().insert(user);
		
	}
	

	
}
