package com.reddisdemo.reddisdemo;


public interface CustomerDAL {

	Customer getCustomerById(String customerId);
	
	Customer addNewCustomer(Customer customer);
	
	
}
