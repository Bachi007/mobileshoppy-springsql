package com.mobileshoppy.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class mobile {

	@Id
	private int mobileId;
	private String mobileName;
	private String mobileCompany;
	private int mobilePrice;
	
}
