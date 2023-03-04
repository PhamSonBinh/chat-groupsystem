package com.hmb.chat.entity;

import com.hmb.chat.Service.TextService;

public class User extends BaseEntity {
	private String firstName;
	private String lastName;
	private String userId;
	private String gender;
	private String dateOfBirth;
	private String username;
    private String hashedPassword;
	
	public User(String username, String password) {
        hashedPassword = hash(password);
        this.username = username;
    }
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	 private String hash(String text) {
	        TextService textService = new TextService();
	        return textService.hashMD5(text);
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

	private void setUserId(String userId) {
		this.userId = userId;
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

}
