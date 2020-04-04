package org.sid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@GetMapping("/sendMessage")
	public void send(@RequestParam(name = "message") String message) {		
		// conversion et envoi du message
		jmsTemplate.convertAndSend("toClient.queue", message);
	}

}
