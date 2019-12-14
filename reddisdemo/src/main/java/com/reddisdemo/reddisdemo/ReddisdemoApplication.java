package com.reddisdemo.reddisdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ReddisdemoApplication implements CommandLineRunner {

	@Autowired
	CustomerDAL repository;
	
	public static void main(String[] args) {
		SpringApplication.run(ReddisdemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repository.addNewCustomer(new Customer("Alice", "Smith"));
		repository.addNewCustomer(new Customer("Bob", "Smith"));
		
		
		
		System.out.println("Customer found with findByCustomerId('Alice');");
		System.out.println("---------------------------------------------");
		System.out.println(repository.getCustomerById("AliceSmith"));
		
		System.out.println("Customer found with findByCustomerId('BobSmith');");
		System.out.println("---------------------------------------------");
		System.out.println(repository.getCustomerById("BobSmith"));
	
		
	}

}
