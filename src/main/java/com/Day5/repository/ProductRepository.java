package com.Day5.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Day5.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
