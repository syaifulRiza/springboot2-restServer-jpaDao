package com.riza.shop1.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.riza.shop1.dao.CustomerDAO;
import com.riza.shop1.model.pojo.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	private EntityManager entityManager;
	 
	@Autowired
	public CustomerDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	@Override
	public List<Customer> getAll() {
		System.out.println("##dao customerimpl getAll 2");
		TypedQuery<Customer> query= entityManager.createQuery("from Customer", Customer.class);
        List<Customer> customers = query.getResultList();

        return customers;
	}

	@Override
	public Customer getById(long id) {
		Customer customer = entityManager.find(Customer.class, id);
	    return customer;
	}

	

}
