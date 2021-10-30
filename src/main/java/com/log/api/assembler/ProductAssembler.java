package com.log.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.log.api.model.ProductRepresentationalModel;
import com.log.api.model.input.ProductInput;
import com.log.domain.model.Product;

@Component
public class ProductAssembler {

	private ModelMapper modelMapper;

	public ProductAssembler(ModelMapper modelMapper) {
		super();
		this.modelMapper = modelMapper;
	}
	
	public ProductRepresentationalModel toModel(Product product) {
		return modelMapper.map(product, ProductRepresentationalModel.class);
	}
	
	public List<ProductRepresentationalModel> toCollectionModel(List<Product> products) {
		return products.stream()
				.map(this::toModel)
				.collect(Collectors.toList());
	}
	
	public Product toEntity(ProductInput productInput) {
		return modelMapper.map(productInput, Product.class);
	}
}
