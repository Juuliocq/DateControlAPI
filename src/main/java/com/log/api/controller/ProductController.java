package com.log.api.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.log.api.assembler.ProductAssembler;
import com.log.api.dto.ProductDTO;
import com.log.domain.model.Product;
import com.log.domain.service.CatalogProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	private CatalogProductService catalogProductService;
	private ProductAssembler productAssembler;
	
	public ProductController(CatalogProductService catalogProductService, ProductAssembler productAssembler) {
		super();
		this.catalogProductService = catalogProductService;
		this.productAssembler = productAssembler;
	}
	
	@GetMapping
	public List<ProductDTO> list(){
		return productAssembler.toCollectionDTO(catalogProductService.listAll());
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<ProductDTO> find(@PathVariable long productId) throws Exception {
		
		return catalogProductService.findById(productId)
				.map(product -> ResponseEntity.ok(productAssembler.toDTO(product)))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/find/{productName}")
	public List<ProductDTO> findByName(@PathVariable String productName) throws Exception{
		return productAssembler.toCollectionDTO(catalogProductService.findByNameContaining(productName));
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public ProductDTO add(@Valid @RequestBody ProductDTO productDTO) {
		Product product = productAssembler.toEntity(productDTO);
		
		return productAssembler.toDTO(catalogProductService.save(product));
	}
	
	@PutMapping("/{productId}")
	public ResponseEntity<Product> update(@PathVariable Long productId, @Valid @RequestBody ProductDTO productDTO){
		if(!catalogProductService.existsById(productId)) {
			return ResponseEntity.notFound().build();
		} else {
    		Product product = productAssembler.toEntity(productDTO);
    		product.setId(productId);
			
			catalogProductService.save(product);
			return ResponseEntity.ok(product.get());
		}
	}
	
	@DeleteMapping("/{productId}")
	public ResponseEntity<Void> delete(@PathVariable Long productId) {
		if(!catalogProductService.existsById(productId)) {
			return ResponseEntity.notFound().build();
		} else {
			catalogProductService.delete(productId);
			return ResponseEntity.noContent().build();
		}
	}
	
}
