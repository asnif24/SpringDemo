package com.asnif.springdemo.dao;

import java.util.List;

import com.asnif.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCutomer(int theId);
	
}
