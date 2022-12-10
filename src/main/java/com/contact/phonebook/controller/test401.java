package com.contact.phonebook.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class test401 {
	
	@GetMapping("/wish")
	public String string() {
		return "well come to india";
	}


}
