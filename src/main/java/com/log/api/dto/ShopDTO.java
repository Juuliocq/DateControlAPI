package com.log.api.dto;

public class ShopDTO {
	
	private Long id;
	private String name;	
	private CityDTO city;
	
	public ShopDTO() {}
	
	public ShopDTO(Long id, String name, CityDTO cityDTO) {
		this.id = id;
		this.name = name;
		this.city = cityDTO;
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

	public CityDTO getCityDTO() {
		return city;
	}

	public void setCityDTO(CityDTO cityDTO) {
		this.city = cityDTO;
	}
}
