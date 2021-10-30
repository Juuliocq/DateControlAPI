package com.log.api.model;

import java.util.Date;

public class ProductRepresentationalModel {

	private Long id;
	private String name;
	private String barCode;
	private Date expirationDate;
	private int quantity;
	private ShopRepresentationalModel shop;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBarCode() {
		return barCode;
	}
	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public ShopRepresentationalModel getShop() {
		return shop;
	}
	public void setShop(ShopRepresentationalModel shop) {
		this.shop = shop;
	}
	
	public ProductRepresentationalModel get() {
		return this;
	}
}
