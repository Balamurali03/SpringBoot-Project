package com.test.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.product.entity.Products;
import com.test.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repo;
	
	public Products Saveproduct(Products product) {
		return repo.save(product);
	}

	public List<Products> get(String cat) {
		
		return repo.getbycategory(cat);
	}
	public List<Products> price(int price){
		return repo.getbyprice(price);
	}
}
