package com.hmb.chat.entity;

import java.util.ArrayList;
import java.util.List;

import com.hmb.chat.Service.TextService;

public class PublicGroup extends Group {
	private String groupCode;
//	private String groupName;
	private TextService textService = new TextService();

	public PublicGroup() {
		super();
		this.groupCode = textService.generateCode();
	}

	private boolean joinByCode(User user, String code) {
		if (code.equals(groupCode)) {
			addUser(user);
			return true;
		}
		return false;
	}
	
	private void leaveGroup(User user, Group idGroup) {
		int userId = user.getId();
		
		deleteUser(userId);
	}
}