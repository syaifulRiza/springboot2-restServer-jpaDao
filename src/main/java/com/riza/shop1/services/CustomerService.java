package com.riza.shop1.services;

import java.util.List;

import com.riza.shop1.model.pojo.Customer;

public interface CustomerService {
	public List<Customer> getAll();
	public Customer getById( long id );
}
