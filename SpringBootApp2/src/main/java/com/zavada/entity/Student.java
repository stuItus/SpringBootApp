package com.zavada.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter @Setter
public class Student extends BaseEntity {

	@NotNull(message = "Name can't be null")
	@NotEmpty(message = "Name field can't be empty")
	@Column(name = "full_name")
	private String fullName;
	
	@Min(message = "Shoud be more that 10", value = 10)
	@Max(message = "Shoud be less taht 70", value = 70)
	private int age;
	
	@Column(name = "email")
	@NotEmpty(message = "Email field can't be empty")
	@NotNull(message = "Email can't be null")
	private String email;
	
	@NotNull(message = "Field country should be selected")
	@ManyToOne
	@JoinColumn(name = "country_id")
	private Country country;
	
}
