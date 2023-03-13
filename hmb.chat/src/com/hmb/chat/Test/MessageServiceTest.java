package com.hmb.chat.Test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.hmb.chat.Service.GroupService;
import com.hmb.chat.Service.MessageService;
import com.hmb.chat.Service.UserService;
import com.hmb.chat.data.DataStorage;
import com.hmb.chat.data.InMemoryDataStorage;
import com.hmb.chat.entity.User;

public class MessageServiceTest {
	private DataStorage storage;
	private MessageService messService;
	private UserService userService;

	@Before
	public void setUp() {
		storage = InMemoryDataStorage.GetInStance();
		messService = new MessageService(storage);
		userService = new UserService(storage);
	}

	@Test
	public void testSentToUserSuccessfully() {
		userService.addUserID("hieu", "123", 1);
		userService.addUserID("binh", "332", 2);
		boolean actual = messService.sendMessageToUser(1, 2, "This is a content");
		assertTrue(actual);
	}

	@Test
	public void testSentToUserFailed() {
		userService.addUserID("hieu", "123", 1);
		userService.addUserID("binh", "332", 2);
		boolean actual = messService.sendMessageToUser(1, 3, "This is a content");
		assertFalse(actual);
	}

	@Test
	public void testGetMessageBetween() {
		userService.addUserID("hieu", "123", 1);
		userService.addUserID("binh", "332", 2);
		messService.sendMessageToUser(1, 2, "This is a content");
		String actual = messService.getMessageListBetween(1, 2).get(0).getMessageContent();
		String expected = "This is a content";
		assertEquals(actual, expected);
	}

	@Test
	public void testDeleteMessageSucessfully() {
		userService.addUserID("hieu", "123", 1);
		userService.addUserID("binh", "332", 2);
		messService.sendMessageToUser(1, 2, "This is a content");
		boolean actual = messService.deleteMessage(1, 2, "This is a content");
		assertTrue(actual);
	}
	
	@Test
	public void testDeleteMessageFail() {
		userService.addUserID("hieu", "123", 1);
		userService.addUserID("binh", "332", 2);
		messService.sendMessageToUser(1, 2, "This is a content");
		boolean actual = messService.deleteMessage(1, 2, "ascas sadas asdas");
		assertFalse(actual);
	}
}
