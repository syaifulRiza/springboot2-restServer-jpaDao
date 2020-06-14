package com.riza.shop1.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riza.shop1.dao.CustomerDAO;
import com.riza.shop1.model.pojo.Customer;
import com.riza.shop1.services.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired 
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getAll(){
		return customerDAO.getAll();
	}

	@Override
	public Customer getById(long id) {
		return customerDAO.getById(id);
	}
	
}
