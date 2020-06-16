package com.riza.shop1.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.riza.shop1.model.pojo.Product;
import com.riza.shop1.repositories.ProductRepository;

@Service
public class ProductServiceImpl {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAll(){
		return (List<Product>)productRepository.findAll();
	}
	
}
