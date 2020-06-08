package org.evolent.exercise.contact.service;

import java.util.List;
import java.util.Optional;

import org.evolent.exercise.contact.exception.ContactNotFoundException;
import org.evolent.exercise.contact.model.Contact;
import org.evolent.exercise.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ContactServiceImpl implements ContactService {
	
	@Autowired
	ContactRepository contactRepository;

	@Override
	public Contact createContact(Contact contact) {
		return contactRepository.save(contact);
	}

	@Override
	public Contact updateContact(Contact contact) {
		 Optional < Contact > contactDb = contactRepository.findById(contact.getId());

	        if (contactDb.isPresent()) {
	        	Contact contactUpdate = contactDb.get();
	        	contactUpdate.setId(contact.getId());
	        	contactUpdate.setFirstName(contact.getFirstName());
	        	contactUpdate.setLastName(contact.getLastName());
	        	contactUpdate.setEmail(contact.getEmail());
	        	contactUpdate.setPhoneNo(contact.getPhoneNo());
	        	contactUpdate.setStatus(contact.getStatus());
	        	contactRepository.save(contactUpdate);
	            return contactUpdate;
	        } else {
	            throw new ContactNotFoundException("Record not found with id : " + contact.getId());
	        }
	}

	@Override
	public List<Contact> getAllContact() {
		return contactRepository.findAll();
	}

	@Override
	public Contact getContactById(long contactId) {
		 Optional < Contact > contact = contactRepository.findById(contactId);

	        if (contact.isPresent()) {
	            return contact.get();
	        } else {
	            throw new ContactNotFoundException("Record not found with id : " + contactId);
	        }
	}

	@Override
	public void deleteContact(long contactId) {
		Optional < Contact > contact = contactRepository.findById(contactId);
        if (contact.isPresent()) {
            contactRepository.delete(contact.get());
        } else {
            throw new ContactNotFoundException("Record not found with id : " + contactId);
        }
	}

}
