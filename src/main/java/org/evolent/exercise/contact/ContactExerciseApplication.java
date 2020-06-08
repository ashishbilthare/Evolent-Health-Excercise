package org.evolent.exercise.contact;

import org.evolent.exercise.contact.model.Contact;
import org.evolent.exercise.contact.repository.ContactRepository;
import org.evolent.exercise.contact.service.ContactService;
import org.evolent.exercise.contact.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ContactExerciseApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(ContactExerciseApplication.class, args);
	}

}
