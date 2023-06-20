package com.mobileshoppy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
	public String addMobile(@RequestBody mobile m1) {
	
		return service.saveMobile(m1);
		
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/mobile")
	public List<mobile> getMobile(){
		return service.getMobile();
	}
	
	@PutMapping("/updatemobile")
	public String updateMobile(@RequestBody mobile m2) {
		return service.updateMobile(m2);
	}
	
	@DeleteMapping("/mobile/{id}")
	public String deleteMobile(@PathVariable int id) {

		return service.deleteMobile(id);
	}
	
	@GetMapping("mobile/{id}")
	public Optional<mobile> getMobilebyId(@PathVariable int id) {
		return service.getMobilebyId(id);
	}
	
	
	
	
}
