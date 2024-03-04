package com.jspiders.designpatternbilder.main;

import com.jspiders.designpatternbilder.creation.Contact;
//import com.jspiders.designpatternbilder.creation.Contact;
import com.jspiders.designpatternbilder.creation.ContactBilder;

public class ContactMain {
	
	public static void main(String[] args) {
		Contact contact = new ContactBilder().setFirstName("Ram \n").setLastName("Suryavanshi \n").getContact();
		System.out.println(contact);
	}
}

