package com.log.api.model.input;

import java.util.Date;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.log.api.model.ShopRepresentationalModel;

public class ProductInput {

	@NotNull
	private Long id;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String barCode;
	
	@NotBlank
	private Date expirationDate;
	
	@NotBlank
	private int quantity;
	
	@NotBlank
	@Valid
	private ShopRepresentationalModel shop;
}
