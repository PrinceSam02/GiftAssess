package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Shop;

public interface ShopService {
	
	public void addShop(Shop customer);
	public Shop getShop(int id);
	public List<Shop> getAllShop();
	public void updateShop(Shop shop);
	public void deleteShop(int id);

}
