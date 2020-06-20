package com.bkumar.spring.model;

public class Person {
	private String firstName;
	private String lasttName;
	
	
	public Person() {
		
	}
	
	public Person(String firstName, String lasttName) {
		super();
		this.firstName = firstName;
		this.lasttName = lasttName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLasttName() {
		return lasttName;
	}
	public void setLasttName(String lasttName) {
		this.lasttName = lasttName;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lasttName=" + lasttName + "]";
	}
	
	

}
