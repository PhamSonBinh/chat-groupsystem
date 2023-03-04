package com.hmb.chat.entity;

import java.util.ArrayList;

public abstract class Group {
	private ArrayList<User> users;
	private String chatGroupId;
	private int numberOfUsers;

	public Group(ArrayList<User> users, String chatGroupId) {
		super();
		this.users = users;
		this.chatGroupId = chatGroupId;
		
	}
	public void addUser() {
		
	}
	public void deleteUser() {
		
	}
	public void createGroup() {
		
	}
	public void removeGroup() {
		
	}
}
