package com.asnif.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.asnif.springdemo.dao.CustomerDAO;
import com.asnif.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer DAO
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCostomer(Customer theCustomer) {

		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {

		return customerDAO.getCustomers(theId);
	}

}
