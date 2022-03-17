 package com.one.Messenger3.resources;


import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.one.Messenger3.model.Message;
import com.one.Messenger3.service.MessageService;


@Path("/messages")
public class MessageResource 
{
	MessageService messageService= new MessageService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
    public List<Message> getMessagess() {
        return messageService.getAllMessages();
    } 
	
	
	
	
	
}
