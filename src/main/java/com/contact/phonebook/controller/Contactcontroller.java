package com.contact.phonebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.contact.phonebook.Entity.Contacts;
import com.contact.phonebook.service.ContactsService;


@RestController
public class Contactcontroller {

	@Autowired
	ContactsService contactsService;
	
	@PostMapping("/createcontact")
	public Contacts createContact(@RequestBody Contacts contacts) {
		
			return contactsService.createContact(contacts);
		
	}
	
	@GetMapping("/getallContacts")
	public List<Contacts> getallContacts(){
		
		return contactsService.getallContactsDetails();
		
	}
	
	@PutMapping("/updateContact/{id}")
	public Contacts updateContactsDetail(@RequestBody Contacts contact,@PathVariable("id") int contactid) {
		
		return contactsService.updateContactsDetail(contact,contactid);
	
	}
}
