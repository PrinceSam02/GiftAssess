package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Shop_tbl")
public class Shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="shopname")
	private String shopname;
	@Column(name="location")
	private String location;
	@Column(name="managername")
	private String managername;
	@OneToOne(targetEntity = Product.class,cascade = CascadeType.ALL)
	@JoinColumn(name = "product")
	private Product product;
	public Shop() {
		super();
	}
	public Shop(int id, String shopname, String location, String managername, Product product) {
		super();
		this.id = id;
		this.shopname = shopname;
		this.location = location;
		this.managername = managername;
		this.product = product;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getShopname() {
		return shopname;
	}
	public void setShopname(String shopname) {
		this.shopname = shopname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getManagername() {
		return managername;
	}
	public void setManagername(String managername) {
		this.managername = managername;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	@Override
	public String toString() {
		return "Shop [id=" + id + ", shopname=" + shopname + ", location=" + location + ", managername=" + managername
				+ ", product=" + product + "]";
	}
}
