package com.one.Messenger3.service;


import java.util.ArrayList;
import java.util.List;
import com.one.Messenger3.model.Message;



public class MessageService {

	public List<Message> getAllMessages(){
		
		Message m1 = new Message(1L, "hi world","radha");
		Message m2 = new Message(2L, "hey jersey","bhaviin");
		List<Message> list= new ArrayList<>();
		list.add(m1);
		list.add(m2);
		
		return list;
	}
	
	
	
}
	

