package com.reddisdemo.reddisdemo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

public class CustomerDALImpl implements CustomerDAL {
	
	@Autowired
	private RedisTemplate<String, String> redisTemplate;


	@Override
	public Customer getCustomerById(String key) {
		// TODO Auto-generated method stub
		final String firstName = (String) redisTemplate.opsForHash().get(key, "firstName");
		final String lastName = (String) redisTemplate.opsForHash().get(key, "lastName");
		return new Customer(firstName, lastName);
	}

	@Override
	public Customer addNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
	    final Map<String, Object> properties = new HashMap<>();
	    properties.put("firstName", customer.firstName);
	    properties.put("lastName", customer.lastName);
		redisTemplate.opsForHash().putAll(customer.firstName+customer.lastName, properties);
		return customer;
	}

}
