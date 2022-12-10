package com.contact.phonebook.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Contact_details")
public class Contacts {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int contactid;
	
	private String contactName;
	
	private String contactEmail;
	
	private Long phoneNum;

	public Contacts(int contactid, String contactName, String contactEmail, Long phoneNum) {
		super();
		this.contactid = contactid;
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.phoneNum = phoneNum;
	}

	public Contacts() {
		super();
	}

	@Override
	public String toString() {
		return "Contacts [contactid=" + contactid + ", contactName=" + contactName + ", contactEmail=" + contactEmail
				+ ", phoneNum=" + phoneNum + "]";
	}

	public int getContactid() {
		return contactid;
	}

	public void setContactid(int contactid) {
		this.contactid = contactid;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public Long getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(Long phoneNum) {
		this.phoneNum = phoneNum;
	}
	
	
	
	
	
}
