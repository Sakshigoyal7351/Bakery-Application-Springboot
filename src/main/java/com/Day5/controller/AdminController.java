package com.Day5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.Day5.dto.ProductDTO;
import com.Day5.model.Category;
import com.Day5.service.CategoryService;
import com.Day5.service.ProductService;

@Controller
public class AdminController {
	
	
	
	
	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;

	@GetMapping("/admin")
	public String adminHome()
	{
		return "adminHome";
	}
	
	@GetMapping("/admin/categories")
	public String getCat(Model model)
	{
		model.addAttribute("categories",categoryService.getAllCategory());
		return "categories";
	}
	
	@GetMapping("/admin/categories/add")
	public String getCatAdd(Model model)
	{
		model.addAttribute("category", new Category());
		return "categoriesAdd";
	}
	

	@PostMapping("/admin/categories/add")
	public String postCatAdd(@ModelAttribute("category") Category category)
	{
		categoryService.addCategory(category);
		return "redirect:/admin/categories";
	}
	
	@GetMapping("/admin/categories/delete/{id}")
	public String deleteCat(@PathVariable int id)
	{
		categoryService.removeCategoryById(id);
		return "redirect:/admin/categories";
	}
	
	@GetMapping("/admin/categories/update/{id}")
	public String updateCat(@PathVariable int id, Model model)
	{
	 Category category=	categoryService.getCategoryById(id);
	 model.addAttribute("category",category);
	 return "categoriesAdd";
	}
	// product Section 
	
	@GetMapping("/admin/products")
	public String products(Model model) {
		model.addAttribute("products", productService.getAllProduct());
		return "products";
	}
	
	
	@GetMapping("/admin/products/add")
	public String productAdd(Model model)
	{
		model.addAttribute("productDTO", new ProductDTO());
		model.addAttribute("categories", categoryService.getAllCategory());
		return "productsAdd";
	}
	
	
	
	
	
	
	
	
	
	
}
