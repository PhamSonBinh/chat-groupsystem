package com.hmb.chat.Service;

import java.util.ArrayList;
import java.util.List;

import com.hmb.chat.data.DataStorage;
import com.hmb.chat.entity.*;

public class MessageServices {
	private final DataStorage storage;
	
	public MessageService (DataStorage storage) {
		this.storage= storage;
	}
	
	public boolean sendMessageToUser (int senderId, int receiverId, String content) {
		User tempReceiver = storage.getUsers().getFirst(user -> user.getId()==receiverId);
		if (tempReceiver!=null) {
			Message message = new Message(senderId, receiverId, content);
			this.storage.getMessages().insert(message);
			return true;
		}
		return false;
	}
	
	public boolean sendMessageToGroup (int senderId, int recevingGroupId, String content) {
		Group tempGroup = storage.getGroups().getFirst(group -> group.getId()==recevingGroupId);
		if (tempGroup!=null) {
			Message message = new Message(senderId, recevingGroupId, content);
			this.storage.getMessages().insert(message);
			return true;
		}
		return false;
	}
	
	public boolean deleteMessage (int senderId, int receiverId, String content) {
		Message tempMessage = storage.getMessages().getFirst(message -> message.getSenderId()==senderId
				&&message.getReceiverId()==receiverId&&message.getMessageContent()==content);
		if (tempMessage!=null) {
			storage.getMessages().delete(tempMessage);
			return true;
		}
		return false;
	}
	
	public List<Message> getMessageListBetween(int senderId, int receiverId) {
		return storage.getMessages().get(message -> message.getSenderId()==senderId&&message.getReceiverId()==receiverId);
	}
	
	public List<Message> getTopLatestMessage(int senderId, int receiverId, int numberOfLatestMessages, int numberOfExcludedMessages) {
		List<Message> allMessgesBetweenSenderAndReceiver = getMessageListBetween(senderId, receiverId);
		int messageListSize = allMessgesBetweenSenderAndReceiver.size();
		List<Message> outputMessages = new ArrayList<Message>();
		for (int index=messageListSize-numberOfExcludedMessages-numberOfLatestMessages; 
				 index<messageListSize-numberOfExcludedMessages; index++) {
			outputMessages.add(allMessgesBetweenSenderAndReceiver.get(index));
		}
		return outputMessages;
	}
	
	public StringBuffer viewMessage (int senderId, int receiverId) {
		StringBuffer output = new StringBuffer();
		List<Message> allMessages = getMessageListBetween(senderId, receiverId);
		for(Message message : allMessages) {
			output.append(message.getId()).append(" ").append(message.getMessageContent()).append("\n");
		}
		return output;
	}
	
	//find messages that contain the query string
	public List<Message> findMessage(int senderId, int receiverId, String queryString) {
		List<Message> output = new ArrayList<>();
		List<Message> messages = getMessageListBetween(senderId, receiverId);
		for (Message message: messages) {
			if(message.getMessageContent().equalsIgnoreCase(queryString)) {
				output.add(message);
			}
		}
		return output;
	}
}
