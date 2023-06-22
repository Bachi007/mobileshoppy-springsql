package com.mobileshoppy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobileshoppy.model.*;
@Repository
public interface userRepository extends JpaRepository<user,Integer> {

	
	user findByUserName(String userName);
	
}
