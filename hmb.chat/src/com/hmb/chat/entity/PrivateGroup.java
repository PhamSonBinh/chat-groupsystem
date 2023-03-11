package com.hmb.chat.entity;

import java.util.ArrayList;

import java.util.List;

public class PrivateGroup extends Group {
	private String groupCode;
	private String groupName;
	private List<User> admins;

	public PrivateGroup(User user, String groupName) {
		super();
		admins.add(user);
		addUser(user);
		this.groupName = groupName;
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
