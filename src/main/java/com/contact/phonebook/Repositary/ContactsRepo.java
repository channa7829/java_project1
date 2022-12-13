package com.contact.phonebook.Repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.contact.phonebook.Entity.Contacts;

public interface ContactsRepo extends JpaRepository<Contacts,Integer>{
	
	

}
