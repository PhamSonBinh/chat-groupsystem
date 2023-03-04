package com.hmb.chat.entity;

public class BaseEntity {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	 public void setIdIfNotExist(int id) {
	        if (id != 0) {
	            setId(id);
	        }
	    }
}
