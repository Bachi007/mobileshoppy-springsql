package com.mobileshoppy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobileshoppy.model.mobile;
import com.mobileshoppy.service.mobileService;

@RestController
public class mobileController {

	@Autowired
	mobileService service;
	
	@RequestMapping(method=RequestMethod.POST, value="/mobile")
	public ResponseEntity<String> addMobile(@RequestBody mobile m1) {
	
		String status= service.saveMobile(m1);
		
		if(status==null) {
			return new ResponseEntity<>(status,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(status,HttpStatus.CREATED);
		}
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/mobile")
	public ResponseEntity<List<mobile>> getMobile(){
		return new ResponseEntity<>(service.getMobile(),HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/updatemobile")
	public ResponseEntity<String> updateMobile(@RequestBody mobile m2) {
		String status= service.updateMobile(m2);
		if(status==null) {
			return new ResponseEntity<>(status,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(status,HttpStatus.CREATED);
		}
	}
	
	@DeleteMapping("/mobile/{id}")
	public ResponseEntity<String> deleteMobile(@PathVariable int id) {

		String status= service.deleteMobile(id);
		if(status==null) {
			return new ResponseEntity<>(status,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(status,HttpStatus.CREATED);
		}
	}
	
	@GetMapping("mobile/{id}")
	public ResponseEntity<Optional<mobile>> getMobilebyId(@PathVariable int id) {
		Optional<mobile> m1= service.getMobilebyId(id);
		if(m1.isEmpty()) {

			return new ResponseEntity<>(m1,HttpStatus.INTERNAL_SERVER_ERROR);
		}
		else {
			return new ResponseEntity<>(m1,HttpStatus.ACCEPTED);
					
		}
		
		
	}
	
	
	
	
}
