package com.log.domain.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shop")
public class Shop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	
	/*@OneToMany
	@Transient
	private List<Product> productList = new ArrayList<>();*/
	
	@ManyToOne
	private City city;

	public Shop() {}
	
	public Shop(Long id, String name, City city, List<Product> list) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		//this.productList = list;
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
	
	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	/*public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> list) {
		this.productList = list;
	}*/
}
