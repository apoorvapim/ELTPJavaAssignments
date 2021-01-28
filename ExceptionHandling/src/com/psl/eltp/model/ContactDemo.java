package com.psl.eltp.model;

import java.time.LocalDate;

class RequiredFieldException extends Exception {
	String str;
	RequiredFieldException(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "RequiredFieldException occured: "+str;
	}
}
class InvalidFormatException extends Exception {
	String str;
	InvalidFormatException(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "InvalidFormatException occured: "+str;
	}
}
public class ContactDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			Contact contact = new Contact();
			contact.setFirstName("Aaa");
			contact.setLastName("Efg");
			contact.setDob(LocalDate.of(1998, 10, 6));
			contact.setEmail("dhgskj@dhs.com");
			contact.setTelephone("873256");
			contact.validate();
			System.out.println("Contact added successfully!");
		} catch (RequiredFieldException | InvalidFormatException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex);
		}

	}

}
