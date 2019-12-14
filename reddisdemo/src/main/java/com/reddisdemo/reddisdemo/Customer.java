package com.reddisdemo.reddisdemo;


public class Customer {
	

	public String firstName;
	public String lastName;
	
	public Customer() {}
	
	public Customer(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		
	}
	
	@Override
	public String toString() {
		return String.format("Customer[  first name = %s,"
				+ " last name = %s ]",  this.firstName, this.lastName);
	}

}
