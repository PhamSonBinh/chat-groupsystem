package com.hmb.chat.entity;

import com.hmb.chat.data.DataStorage;

public class Message extends BaseEntity {
	private int messageId;
	private String messageContent;
	private int senderId;
	private int receiverId;
	private DataStorage storage;

	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Message(int senderId, int receiverId, String content) {
		this.senderId = senderId;
		this.receiverId = receiverId;
		this.messageContent = content;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public String getMessageContent() {
		return messageContent;
	}

	public void setMessageContent(String messageContent) {
		this.messageContent = messageContent;
	}

	public int getSenderId() {
		return senderId;
	}

	public void setSenderId(int senderId) {
		this.senderId = senderId;
	}

	public int getReceiverId() {
		return receiverId;
	}

	public void setReceiverId(int receiverId) {
		this.receiverId = receiverId;
	}
	
}
