package org.evolent.exercise.contact.controller;

import java.util.List;

import javax.validation.Valid;

import org.evolent.exercise.contact.model.Contact;
import org.evolent.exercise.contact.service.ContactServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
	
	@Autowired
	ContactServiceImpl contactService;

	 @GetMapping("/contacts")
	    public ResponseEntity < List < Contact >> getAllContact() {
	        return ResponseEntity.ok().body(contactService.getAllContact());
	    }

	    @GetMapping("/contacts/{id}")
	    public ResponseEntity < Contact > getContactById(@PathVariable long id) {
	        return ResponseEntity.ok().body(contactService.getContactById(id));
	    }

	    @PostMapping("/contacts")
	    public ResponseEntity < Contact > createContact(@RequestBody @Valid Contact contact) {
	        return new ResponseEntity<>(contactService.createContact(contact),HttpStatus.CREATED);
	    }

	    @PutMapping("/contacts/{id}")
	    public ResponseEntity < Contact > updateContact(@PathVariable long id, @RequestBody @Valid Contact contact) {
	    	contact.setId(id);
	        return ResponseEntity.ok().body(this.contactService.updateContact(contact));
	    }

	    @DeleteMapping("/contacts/{id}")
	    public HttpStatus deleteContact(@PathVariable long id) {
	        this.contactService.deleteContact(id);
	        return HttpStatus.OK;
	    }
}
