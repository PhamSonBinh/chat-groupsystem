package com.hmb.chat.entity;

import java.util.ArrayList;

import com.hmb.chat.model.Group;

public class PrivateGroup extends Group {
	private ArrayList<User> admin;
	public PrivateGroup(ArrayList<User> users, String chatGroupId, int numberOfUsers) {
		super(users, chatGroupId, numberOfUsers);
		// TODO Auto-generated constructor stub
	}
	

}
