package org.evolent.exercise.contact;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	/*
	 * @Autowired ContactService conSer;
	 */
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		//conSer.createContact(new Contact(1L,"as","bi","ab@ab.com","8103","act"));
		return application.sources(ContactExerciseApplication.class);
	}

}
