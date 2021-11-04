package com.log.api.dto;

import java.util.Date;

public class ProductDTO {

	private Long id;
	private String name;
	private String barCode;
	private Date expirationDate;
	private int quantity;
	private ShopDTO shop;
	
	public ProductDTO() {}
	
	public ProductDTO(Long id, String name, String barCode, Date expirationDate, int quantity, ShopDTO shop) {
		this.id = id;
		this.name = name;
		this.barCode = barCode;
		this.expirationDate = expirationDate;
		this.quantity = quantity;
		this.shop = shop;
	}


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
	
	public ShopDTO getShop() {
		return shop;
	}
	
	public void setShop(ShopDTO shop) {
		this.shop = shop;
	}
	
	public ProductDTO get() {
		return this;
	}
}
