package com.psb.chat;

import java.util.ArrayList;

public class PublicGroup extends Group {
	private ArrayList<User> admin;
	public PublicGroup(ArrayList<User> users, String chatGroupId, int numberOfUsers) {
		super(users, chatGroupId, numberOfUsers);
		// TODO Auto-generated constructor stub
	}
	
}
