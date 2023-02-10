package com.hmb.chat.Service;

import com.hmb.chat.data.DataStorage;
import com.hmb.chat.data.InMemeoryDataStorage;

public class UserService {
	private String userPassword;
	private String userId;
	private InMemeoryDataStorage dataStorage;
	
	public UserService() {
		//tobe fixed
		dataStorage = new InMemeoryDataStorage();
	}
 	
	public static boolean login (String username, String password) {
//		InMemeoryDataStorage data = new InMemeoryDataStorage();
//		if (data.getUsers().get(username) != null) && (data.a)
		return false;
	}
}
