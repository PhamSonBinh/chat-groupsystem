package com.hmb.chat.entity;

import java.util.ArrayList;

import java.util.List;

public class PrivateGroup extends Group {
	private String groupCode;
	private String groupName;
	private List<User> admins;

	public PrivateGroup(User user) {
		super();
		admins.add(user);
	}

	private boolean joinByInvitation(User user) {
		int id = user.getId();
		if (getUserById(id) == null) {
			addUser(user);
			return true;
		}
		return false;
	}
}
