package com.maverick.besttea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.SaleBillDetails;

public interface SaleBillDetailsRepository extends JpaRepository<SaleBillDetails, Integer>{
 
		SaleBillDetails save(SaleBillDetails saleBillDetails);

}
