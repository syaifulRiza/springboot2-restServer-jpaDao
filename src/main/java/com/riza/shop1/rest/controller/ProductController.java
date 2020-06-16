package com.riza.shop1.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riza.shop1.model.pojo.Product;
import com.riza.shop1.services.impl.ProductServiceImpl;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductServiceImpl productServiceImpl;
	
	@GetMapping(value = "/findAll", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Product> findAll(){
		return productServiceImpl.getAll();
	}
}
