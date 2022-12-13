package com.contact.phonebook.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.contact.phonebook.Entity.Contacts;
import com.contact.phonebook.Repositary.ContactsRepo;

@Service
public class ContactsServiceImpl implements ContactsService{

	@Autowired
	ContactsRepo contactsRepo;
	

	@Override
	public List<Contacts> getallContactsDetails() {
		
		return contactsRepo.findAll();
	}

	@Override
	public Contacts updateContactsDetail(Contacts contact, int contactid) {
		
	
		
		Contacts contacttobemodified = contactsRepo.findById(contactid).get();
		
		if(Objects.nonNull(contact.getPhoneNum())) {
		
			contacttobemodified.setPhoneNum(contact.getPhoneNum());
		}
		if(Objects.nonNull(contact.getContactName()) && !"".equalsIgnoreCase(contact.getContactName())) {
			
			contacttobemodified.setContactName(contact.getContactName());
		}
        if(Objects.nonNull(contact.getContactEmail()) && !"".equalsIgnoreCase(contact.getContactEmail())) {
			
			contacttobemodified.setContactEmail(contact.getContactEmail());
		}
		
		
		return contactsRepo.save(contacttobemodified);
		
		
	}


	@Override
	public Contacts createContact(Contacts contacts) {
		
		
		return contactsRepo.save(contacts);
		
	}

}
