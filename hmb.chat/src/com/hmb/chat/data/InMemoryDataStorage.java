package com.hmb.chat.data;

import com.hmb.chat.repository.GroupRepository;
import com.hmb.chat.repository.UserRepository;

public class InMemoryDataStorage extends DataStorage {
	private InMemoryDataStorage storage;

	private InMemoryDataStorage() {
		users = new UserRepository();
		groups = new GroupRepository();
	}

	public InMemoryDataStorage GetDataStorage() {
		if (storage == null) {
			storage = new InMemoryDataStorage();
		}
		return storage;
	}

	public InMemoryDataStorage getStorage() {
		return storage;
	}

	public void setStorage(InMemoryDataStorage storage) {
		this.storage = storage;
	}
}
