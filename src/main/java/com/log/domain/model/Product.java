package com.log.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	@Column(name = "bar_code")
	private String barCode;
	
	@JsonFormat(pattern="yyyy/MM/dd")
	@Column(name = "exp_date")
	private Date expirationDate;
	
	private int quantity;
	
	@ManyToOne
	private Shop shop;
	
	public Product() {}
	
	public Product(Long id, String name, String barCode, Date expirationDate, int quantity, Shop shop) {
		super();
		this.id = id;
		this.name = name;
		this.barCode = barCode;
		this.expirationDate = expirationDate;
		this.quantity = quantity;
		this.shop = shop;
	}
	
	public Product get() {
		return this;
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

	public Shop getShop() {
		return shop;
	}

	public void setShop(Shop shop) {
		this.shop = shop;
	}
	
}
