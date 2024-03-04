package com.jspiders.designpatternbilder.creation;

public class Contact {
	private String firstName;
	private String lastName;
	private String email;
	private String dob;
	private long mobileNo;
	
	public Contact(String firstName, String lastName, String email, String dob, long mobileNo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dob = dob;
		this.mobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "Contact [firstName=" + firstName + " lastName=" + lastName + " email=" + email + " dob=" + dob
				+ " mobileNo=" + mobileNo + "]";
	}
	
	
	

}
