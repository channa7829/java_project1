package com.contact.phonebook.service;

import java.util.List;

import com.contact.phonebook.Entity.Contacts;

public interface ContactsService {

	
	List<Contacts> getallContactsDetails();

	Contacts updateContactsDetail(Contacts contact, int contactid);

	Contacts createContact(Contacts contacts);

}
