package com.maverick.besttea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.SupplierMaterialDetails;

public interface SupplierMaterialDetailsRepository extends JpaRepository<SupplierMaterialDetails, Integer>{
	
	SupplierMaterialDetails save(List<SupplierMaterialDetails> supplierMaterialDetailsList);

}
