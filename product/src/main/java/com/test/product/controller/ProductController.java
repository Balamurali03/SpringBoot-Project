package com.test.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.product.entity.Products;
import com.test.product.repository.ProductRepository;
import com.test.product.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	ProductService service;
	@Autowired
	ProductRepository repo;
	@RequestMapping("/save")
	public Products saveproduct(@RequestBody Products product) {
		return service.Saveproduct(product);
	}
	@RequestMapping("/getbycategory")
	public List<Products> get(@RequestParam("category" ) String cat) {
		return service.get(cat);
	}
	@RequestMapping("/getbyprice")
	public List<Products> getbyprice(@RequestParam("price" ) int price) {
		return service.price(price);
	}
	
}
