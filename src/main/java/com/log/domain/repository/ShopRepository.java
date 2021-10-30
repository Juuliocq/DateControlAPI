package com.log.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.log.domain.model.Shop;

@Repository
public interface ShopRepository extends JpaRepository<Shop, Long>{

	List<Shop> findByName(String name);
	List<Shop> findByNameContaining(String name);
}
