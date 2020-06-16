package com.riza.shop1.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.riza.shop1.model.pojo.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

}
