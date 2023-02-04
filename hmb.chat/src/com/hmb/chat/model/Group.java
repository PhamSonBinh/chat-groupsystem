package com.hmb.chat.model;

import java.util.ArrayList;

import com.hmb.chat.entity.User;

public abstract class Group {
	private ArrayList<User> users;
	private String chatGroupId;
	private int numberOfUsers;

	public Group(ArrayList<User> users, String chatGroupId, int numberOfUsers) {
		super();
		this.users = users;
		this.chatGroupId = chatGroupId;
		this.numberOfUsers = numberOfUsers;
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
