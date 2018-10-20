package com.maverick.besttea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.VendorDetails;

public interface VendorDetailsRepository extends JpaRepository<VendorDetails, Integer>{

	VendorDetails save(VendorDetails vendorDetails);
	
	VendorDetails findByVendorId(int vendorId);
	
	List<VendorDetails> findByDelStatus(int delStatus);
	
	
}
