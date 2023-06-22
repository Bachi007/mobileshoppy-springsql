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
public class user {

	@Id
	private int userId;
	private String userName;
	private String userPassword;
	private String userPhone;
	private String userEmail;
	
}
