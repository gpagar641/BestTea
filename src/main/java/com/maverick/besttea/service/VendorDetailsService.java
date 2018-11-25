package com.maverick.besttea.service;

import java.util.List;

import com.maverick.besttea.model.VendorDetails;

public interface VendorDetailsService {

	
	VendorDetails insertVendor(VendorDetails vendorDetails);
	
	VendorDetails getVendorDetailsByVendorId(int vendorId);

	List<VendorDetails> getAllVendorDetails();
}
