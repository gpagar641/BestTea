package com.maverick.besttea.serviceimpl;

import java.util.ArrayList;
import java.util.List;

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
		
		VendorDetails vendorDetailsRes=new VendorDetails();
		try {
			
		
		vendorDetailsRes=vendorDetailsRepository.save(vendorDetails);
		} catch (Exception e) {
			e.getMessage();
		}
		return vendorDetails;
	}

	@Override
	public VendorDetails getVendorDetailsByVendorId(int vendorId) {
		
		VendorDetails vendorDetails=new VendorDetails();
		try {
			 vendorDetails=vendorDetailsRepository.findByVendorId(vendorId);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return vendorDetails;
	}

	@Override
	public List<VendorDetails> getAllVendorDetails() {
		
		List<VendorDetails> vendorDetailsList=new ArrayList<>();
		try {
			vendorDetailsList=vendorDetailsRepository.findAll();
			
		} catch (Exception e) {
			e.getMessage();
		}
		
		
		return vendorDetailsList;
	}

}
