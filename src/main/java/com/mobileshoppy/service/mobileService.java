package com.mobileshoppy.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileshoppy.model.mobile;
import com.mobileshoppy.repository.mobileRepo;

@Service
public class mobileService {

	@Autowired
	mobileRepo repo;
	
	public String saveMobile(mobile m1) {
		repo.save(m1);
		return "mobile is added";
	}

	public List<mobile> getMobile(){
		List<mobile> mobilelist=new ArrayList<>();
		
		repo.findAll().forEach(mobilelist::add);
		
		return mobilelist;
	}
	
}
