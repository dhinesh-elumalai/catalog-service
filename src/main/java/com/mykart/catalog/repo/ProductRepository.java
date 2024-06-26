package com.mykart.catalog.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mykart.catalog.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
