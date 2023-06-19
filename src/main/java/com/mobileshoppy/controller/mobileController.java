package com.mobileshoppy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	
	
	
	
	
}
