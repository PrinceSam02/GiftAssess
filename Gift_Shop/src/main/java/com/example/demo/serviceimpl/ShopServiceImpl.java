package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Shop;
import com.example.demo.repository.ShopRepo;
import com.example.demo.service.ShopService;

@Service
public class ShopServiceImpl implements ShopService {
	
	@Autowired
	ShopRepo repo;
		
	@Override
	public void addShop(Shop shop) {
		repo.save(shop);
	}
	
	@Override
	public Shop getShop(int id) {		
		return repo.findById(id).orElse(null);
	}
	
	@Override
	public List<Shop> getAllShop(){
		return repo.findAll();
	}
	 
	@Override
	public void updateShop(Shop shop) {
		repo.save(shop);
	}
	
	public void deleteShop(int id) {
		repo.deleteById(id);
	}
	
}

