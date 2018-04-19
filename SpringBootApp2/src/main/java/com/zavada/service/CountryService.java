package com.zavada.service;

import java.util.List;

import com.zavada.entity.Country;

public interface CountryService {

	void saveCountry(Country country);
	
	Country findCountryById(int id);
	
	List<Country> findAllCountries();	
}
