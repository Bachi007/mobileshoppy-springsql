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
	
	public String updateMobile(mobile m2) {
		mobile m=repo.save(m2);
		if(m!=null) {
			return "mobile updated";
		}
		else {
			return null;
		}
		
	}
	
	
	
	public String deleteMobile(int mobileid) {
		
		Optional<mobile> m1=repo.findById(mobileid);
	
		if(m1==null) {
			return null;
		}
		else {
			repo.deleteById(mobileid);
			return "mobile deleted";
		}
		
	}
	
	public Optional<mobile> getMobilebyId(int id) {
		return repo.findById(id);
	}
	
	
	
	
	
	
	
	
	
	
	
}
