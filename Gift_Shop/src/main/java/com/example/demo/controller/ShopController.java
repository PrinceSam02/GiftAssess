package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Shop;
import com.example.demo.serviceimpl.ShopServiceImpl;

@RestController
@RequestMapping("/Shop")
@CrossOrigin("http://localhost:3001")
public class ShopController {
	
	@Autowired
	ShopServiceImpl service;
		
	@PostMapping
	public String insertShop(@RequestBody Shop sh)
	{
		String msg="";
		try {
			service.addShop(sh);
			msg="Insert Success";
		} 
		catch(Exception e) {	
			msg="Insert Failure";
		}
			return msg;
	}

	@GetMapping("{id}")
	public Shop getShopById(@PathVariable("id") int id)
	{
		return service.getShop(id);
		}

	@GetMapping("/all")
	public List<Shop> getShop()
	{
		return service.getAllShop();
		}

	@PutMapping()
	public String updateShop(@RequestBody Shop sh)
	{
		String msg="";
	try {
		service.updateShop(sh);
		msg="Update Success";
		} 	
			
	catch(Exception e) {
		msg="Updation Failure";
		}
		return msg;
	}

	@DeleteMapping("{id}")
	public String deleteShopById(@PathVariable("id") int id)
	{
		String msg="";
		try {
			service.deleteShop(id);
			msg="Deletion Success";
		} 
		catch(Exception e) {
			msg="Deletion Failure";
		}	
		return msg;
	}	
	
}

