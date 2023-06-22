package com.mobileshoppy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileshoppy.model.user;
import com.mobileshoppy.model.login;

import com.mobileshoppy.repository.userRepository;

@Service
public class userService {

	@Autowired
	userRepository userRepo;
	public String register(user u1) {
		user u=userRepo.save(u1);
		if(u==null) {
			return null;
		}
		else {
			return "user saved successfully";
		}
	}
	
	public int login(login l1) {
	
		user u2=userRepo.findByUserName(l1.getUserName());
		
		if(u2!=null) {
			if(u2.getUserPassword().equals(l1.getUserPassword())) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			return -1;
		}
		
	}
	
	
}
