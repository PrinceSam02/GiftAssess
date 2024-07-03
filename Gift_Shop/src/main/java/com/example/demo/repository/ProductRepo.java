package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer>{
	@Query("select id from Product")
	List<Integer>fetchIdList();
}
