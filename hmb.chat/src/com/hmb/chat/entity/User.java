package com.hmb.chat.entity;

import com.hmb.chat.service.TextService;

public class User {
	private String firstName;
	private String lastName;
	private String userId;
	private String userName;
	private String password;
	private String gender;
	private String dateOfBirth;
	private String hashedPassword;

	public User(String firstName, String lastName, String userId, String password, String gender, String dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.password = password;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;

	}

	public User(String userName, String password) {
		this.userName = userName;
		hashedPassword = hash(password);
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	private String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public boolean login(String password) {
		String hashedInputPassword = hash(password);
		return hashedPassword.equals(hashedInputPassword);
	}

	private String hash(String text) {
		TextService textService = new TextService();
		return textService.hashMD5(text);
	}
}
