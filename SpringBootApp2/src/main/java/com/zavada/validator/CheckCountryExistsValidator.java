package com.zavada.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zavada.repository.CountryRepository;

@Component
public class CheckCountryExistsValidator implements ConstraintValidator<CheckCountryExists, String> {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public void initialize(CheckCountryExists constraintAnnotation) {

	}

	@Override
	public boolean isValid(String countryName, ConstraintValidatorContext arg1) {

		if (countryName == null)
			return false;
		
		if (countryRepository.findCountryByName(countryName) != null) {
			return false;
		} else {
			return true;
		}
	}
}