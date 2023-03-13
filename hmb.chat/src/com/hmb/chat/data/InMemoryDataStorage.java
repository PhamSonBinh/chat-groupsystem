package com.hmb.chat.data;

import com.hmb.chat.entity.Group;
import com.hmb.chat.entity.Message;
import com.hmb.chat.entity.User;
import com.hmb.chat.repository.InMemoryRepository;

public class InMemoryDataStorage extends DataStorage {
	private static InMemoryDataStorage storage;

	private InMemoryDataStorage() {
		users = new InMemoryRepository<User>();	
		groups = new InMemoryRepository<Group>();
		messages = new InMemoryRepository<Message>();
	}
	

	public static InMemoryDataStorage GetInStance() {
		if (storage == null) {
			storage = new InMemoryDataStorage();
		}
		return storage;
	}
}