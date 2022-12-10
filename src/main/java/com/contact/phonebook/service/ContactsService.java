package com.contact.phonebook.service;

import java.util.List;

import com.contact.phonebook.Entity.Contacts;

public interface ContactsService {

	Contacts createContact(Contacts contacts);

	List<Contacts> getallContactsDetails();

	Contacts updateContactsDetail(Contacts contact, int contactid);

}
