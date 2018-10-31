package com.maverick.besttea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.CustomerTableDetails;

public interface CustomerTableDetailsRepository extends JpaRepository<CustomerTableDetails, Integer>{

	
	CustomerTableDetails save(CustomerTableDetails customerTableDetails);
	
	List<CustomerTableDetails> findByDelStatus(int delStatus);
}
