package com.mykart.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mykart.catalog.entity.Product;
import com.mykart.catalog.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getProducts(){
		return new ResponseEntity<List<Product>>(productService.getAllProducts(), HttpStatus.OK);
	}
	
	
	@PostMapping("/products")
	public ResponseEntity<Product> saveProducts(@RequestBody Product product){
		return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.OK);
	}
	
	@GetMapping("/products/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable("id") Long productId){
		return new ResponseEntity<>(productService.getProductById(productId), HttpStatus.OK);
	}
}
