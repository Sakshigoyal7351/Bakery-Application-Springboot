package com.Day5.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Day5.model.Product;
import com.Day5.repository.ProductRepository;

@Service
public class ProductService {

	
	@Autowired
	ProductRepository productRepository;
	
	
	public List<Product> getAllProduct(){return productRepository.findAll();}
	
	
	}
