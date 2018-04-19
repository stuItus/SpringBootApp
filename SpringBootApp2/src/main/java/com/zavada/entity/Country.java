package com.zavada.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.zavada.validator.CheckCountryExists;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "country")
@NoArgsConstructor
@Getter @Setter
public class Country extends BaseEntity{

	@NotNull
	@NotEmpty
	@CheckCountryExists
	@Size(min = 2)
	private String name;
	
}
