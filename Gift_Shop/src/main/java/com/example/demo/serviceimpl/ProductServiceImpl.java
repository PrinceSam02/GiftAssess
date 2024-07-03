package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductRepo repo;
		
	@Override
	public void addProduct(Product product) {
		repo.save(product);
	}
	 
	@Override
	public Product getProduct(int id) {			
		return repo.findById(id).orElse(null);
	}
	
	@Override
	public List<Product> getAllProduct(){
		return repo.findAll();
	}
	 
	@Override
	public void updateProduct(Product product) {
		repo.save(product);
	}
	
	public void deleteProduct(int id) {
		repo.deleteById(id);
	}
	
	@Override
	public List<Integer> getProductIds() {
		return repo.fetchIdList();
	}
	
}



