package com.zavada.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zavada.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {

	// Country findByName(String name);
	
	@Query("SELECT c FROM Country c WHERE c.name = :name")
	Country findCountryByName(@Param("name") String name);
}
