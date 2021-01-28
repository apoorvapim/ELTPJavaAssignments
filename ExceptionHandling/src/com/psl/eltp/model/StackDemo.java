package com.psl.eltp.model;

import java.time.LocalDate;

class StackOverflowException extends Exception {
	String str;
	StackOverflowException(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "StackOverflowException occured: "+str;
	}
}
class EmptyStackException extends Exception {
	String str;
	EmptyStackException(String str) {
		this.str = str;
	}
	@Override
	public String toString() {
		return "EmptyStackException occured: "+str;
	}
}
public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack(0);
		try {
			Contact contact = new Contact();
			contact.setFirstName("Aaa");
			contact.setLastName("Efg");
			contact.setDob(LocalDate.of(1998, 10, 6));
			contact.setEmail("dhgskj@dhs.com");
			contact.setTelephone("873256");
			stack.push(contact);
			System.out.println("Contact added successfully!");
			stack.pop();
			stack.pop();
		} catch (StackOverflowException | EmptyStackException ex) {
			// TODO Auto-generated catch block
			System.out.println(ex);
		}
	}

}
