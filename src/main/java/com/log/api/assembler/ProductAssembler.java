package com.log.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.log.api.dto.ProductDTO;
import com.log.domain.model.Product;

@Component
public class ProductAssembler {

	private ModelMapper modelMapper;

	public ProductAssembler(ModelMapper modelMapper) {
		super();
		this.modelMapper = modelMapper;
	}
	
	public ProductDTO toDTO(Product product) {
		return modelMapper.map(product, ProductDTO.class);
	}
	
	public List<ProductDTO> toCollectionDTO(List<Product> products) {
		return products.stream()
				.map(this::toDTO)
				.collect(Collectors.toList());
	}
	
	public Product toEntity(ProductDTO product) {
		return modelMapper.map(product, Product.class);
	}
}
