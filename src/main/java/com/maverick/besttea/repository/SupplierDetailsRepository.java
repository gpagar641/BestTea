package com.maverick.besttea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.SupplierDetails;

public interface SupplierDetailsRepository extends JpaRepository<SupplierDetails, Integer>{
	
	SupplierDetails save(SupplierDetails supplierDetails);
	
	List<SupplierDetails> findByDelStatus(int delStatus);

}
