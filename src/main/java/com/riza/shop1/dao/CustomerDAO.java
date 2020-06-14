package com.riza.shop1.dao;

import java.util.List;

import com.riza.shop1.model.pojo.Customer;

public interface CustomerDAO {
	List<Customer> getAll();
	
	Customer getById( long id ); 
	
	
}
