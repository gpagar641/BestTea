package com.maverick.besttea.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.besttea.model.VendorDetails;
import com.maverick.besttea.repository.VendorDetailsRepository;
import com.maverick.besttea.service.VendorDetailsService;

@Service
public class VendorDetailsServiceImpl implements VendorDetailsService{

	@Autowired
	VendorDetailsRepository vendorDetailsRepository;
	
	@Override
	public VendorDetails insertVendor(VendorDetails vendorDetails) {
		// TODO Auto-generated method stub
		VendorDetails vendorDetailsRes=new VendorDetails();
		try {
			
		
		vendorDetailsRes=vendorDetailsRepository.save(vendorDetails);
		} catch (Exception e) {
			// TODO: handle exception
		}
		return vendorDetails;
	}

}
