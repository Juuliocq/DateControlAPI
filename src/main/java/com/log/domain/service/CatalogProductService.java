package com.log.domain.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.log.domain.model.Product;
import com.log.domain.repository.ProductRepository;

@Service
public class CatalogProductService{

	private ProductRepository productRespository;
	
	public CatalogProductService(ProductRepository productRespository) {
		super();
		this.productRespository = productRespository;
	}
	
	public List<Product> listAll(){
		List<Product> list = productRespository.findAll();
		return list;
	}
	
	public Optional<Product> findById(Long productId) throws Exception{
		return productRespository.findById(productId);
	}

	public List<Product> findByNameContaining(String name) throws Exception {
		List<Product> list = productRespository.findByNameContaining(name);
		
		if (!list.isEmpty()) {
			return list;
		} else {
			throw(new Exception("Não foi encontrado nenhum produto com esse nome."));
		}
	}
	
	@Transactional
	public Product save(Product inputProduct) {
		return productRespository.save(inputProduct);
	}
	
	@Transactional
	public void delete(Long idProduct) {		
		productRespository.deleteById(idProduct);
	}
	
	public boolean existsById(Long productId) {
		return productRespository.existsById(productId);
	}
}
