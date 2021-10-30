package com.log.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.log.domain.model.City;

@Repository
public interface CityRepository extends JpaRepository<City, Long>{

	List<City> findByName(String name);
	List<City> findByNameContaining(String name);
}
