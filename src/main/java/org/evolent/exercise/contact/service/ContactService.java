package org.evolent.exercise.contact.service;

import java.util.List;

import org.evolent.exercise.contact.model.Contact;

public interface ContactService {
	Contact createContact(Contact contact);

    Contact updateContact(Contact contact);

    List < Contact > getAllContact();

    Contact getContactById(long contactId);

    void deleteContact(long id);
}
