package com.mobileshoppy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.mobileshoppy.model.user;
import com.mobileshoppy.model.login;
import com.mobileshoppy.service.userService;

@RestController
public class userController {

	@Autowired
	userService service;
	
	@PostMapping("/register")
	public ResponseEntity<String> registeruser(@RequestBody user u1){
		
		String status=service.register(u1);
		if(status==null) {
			return new ResponseEntity<>(status,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(status,HttpStatus.CREATED);
		}
		
	}
	
	@GetMapping("/login")
	public ResponseEntity<String> login(@RequestBody login l1){
		
		int i=service.login(l1);
		if(i==1) {
			return new ResponseEntity<>("login success",HttpStatus.ACCEPTED);
		}
		else {
			if(i==0) {
				return new ResponseEntity<>("wrong credentials",HttpStatus.FORBIDDEN);
			}
			else {
				return new ResponseEntity<>("user not registered",HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		
	}
	
}
