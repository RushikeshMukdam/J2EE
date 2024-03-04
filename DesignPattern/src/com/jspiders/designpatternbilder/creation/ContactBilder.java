package com.jspiders.designpatternbilder.creation;

public class ContactBilder {
	
	private String firstName;
	private String lastName;
	private String email;
	private String dob;
	private long mobileNo;
	
	
	public ContactBilder setFirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public ContactBilder setLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public ContactBilder setEmail(String email) {
		this.email = email;
		return this;
	}
	public ContactBilder setDob(String dob) {
		this.dob = dob;
		return this;
	}
	public ContactBilder setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
		return this;
	}
	
	public Contact getContact() {
		return new Contact(firstName,lastName,email,dob,mobileNo);
	}
	
	
	
	
	
}
