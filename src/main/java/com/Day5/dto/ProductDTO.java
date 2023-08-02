package com.Day5.dto;

import com.Day5.model.Category;

import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class ProductDTO {

	
	
	private Long id;
	private String name;
	private int category;
	private double price;
	private double weight;
	private String description;
	private String imageName;
}
