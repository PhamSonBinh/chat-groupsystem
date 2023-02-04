package com.hmb.chat.data;

import com.hmb.chat.repository.GroupRepository;
import com.hmb.chat.repository.UserRepository;

public class InMemeoryDataStorage extends DataStorage {
	private InMemeoryDataStorage storage;

	public InMemeoryDataStorage() {
		users = new UserRepository();
		groups = new GroupRepository();
	}

	public InMemeoryDataStorage GetDataStorage() {
		if (storage == null) {
			storage = new InMemeoryDataStorage();
		}
		return storage;
	}

	public InMemeoryDataStorage getStorage() {
		return storage;
	}

	public void setStorage(InMemeoryDataStorage storage) {
		this.storage = storage;
	}
}
