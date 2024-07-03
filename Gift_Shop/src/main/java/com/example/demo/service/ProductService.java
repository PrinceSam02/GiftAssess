package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Product;

public interface ProductService {
	
	public void addProduct(Product product);
	public Product getProduct(int id);
	public List<Product> getAllProduct();
	public void updateProduct(Product product);
	public void deleteProduct(int id);
	public List<Integer> getProductIds();
	
}
