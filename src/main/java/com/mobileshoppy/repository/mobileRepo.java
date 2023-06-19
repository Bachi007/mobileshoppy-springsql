package com.mobileshoppy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileshoppy.model.mobile;

@Repository
public interface mobileRepo extends JpaRepository<mobile,Integer>{

}
