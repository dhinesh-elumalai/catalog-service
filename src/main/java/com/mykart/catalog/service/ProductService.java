package com.mykart.catalog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mykart.catalog.entity.Product;
import com.mykart.catalog.repo.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product saveProduct(Product product){
		return productRepository.save(product);
	}
	
	public Product getProductById(Long productId){
		return productRepository.findById(productId).get();
	}
}
