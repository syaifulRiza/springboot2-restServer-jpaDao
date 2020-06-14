package com.riza.shop1.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riza.shop1.model.pojo.Customer;
import com.riza.shop1.rest.request.RequestRestJson;
import com.riza.shop1.services.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl customerService;
	
	
	@RequestMapping("/findId")
	@PostMapping( MediaType.APPLICATION_JSON_VALUE  )
	public Customer findId(@RequestBody RequestRestJson requestBody){
		return customerService.getById(requestBody.getId());
	}
	
	@GetMapping(value = "/findAll", 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Customer> findAll(){
		
		return customerService.getAll();
	}
}
