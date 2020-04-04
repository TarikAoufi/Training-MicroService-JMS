package org.sid.config;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.sid.entity.Student;
import org.sid.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class JMSListeners {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@JmsListener(destination = "schooling.queue")
	public void receive(Message message) throws Exception {

		if (message instanceof TextMessage) {

			String content = ((TextMessage) message).getText();

			System.out.println("**********************");
			System.out.println("Réception du message : " + content);
			System.out.println("**********************");

			Student student = new Student();
			student.setLastName(content.split("_")[0]);
			student.setFirstName(content.split("_")[1]);
			
			studentRepository.save(student);
		}

	}

}
