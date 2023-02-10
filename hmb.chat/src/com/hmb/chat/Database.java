package com.hmb.chat;

import java.util.ArrayList;
import java.util.List;

public class Database {
	private static Database instance;
	private static List userList = new ArrayList<>();
	private static List groupList = new ArrayList<>();
	private Database() {	
	}

	public static Database getInstance() {
		if (instance == null) {
			instance = new Database();		
		}
		return instance;
	}

	public static void setInstance(Database instance) {
		Database.instance = instance;
	}
	public void setUserList(List userList) {
		this.userList = userList;
	}
	public static void setGroupList(List groupList) {
		Database.groupList = groupList;
	}
	public List getUserList() {
		if (userList == null) {
			
		}
		return userList;

	};
	public static List getGroupList() {
		return groupList;
	}
	public void callQuery() {
		// For instance, all database queries of an app go
		// through this method. Therefore, you can place
		// throttling or caching logic here.
		// ...
	}

}
