package com.maverick.besttea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.UnitDetails;

public interface UnitDetailsRepository extends JpaRepository<UnitDetails, Integer>{
    
	List<UnitDetails> findByDelStatus(int delStatus); 
	
}
