package com.maverick.besttea.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.besttea.model.UnitDetails;
import com.maverick.besttea.repository.UnitDetailsRepository;
import com.maverick.besttea.service.UnitDetailsService;



@Service
public class UnitDetailsServiceImpl implements UnitDetailsService{
	
	@Autowired
	UnitDetailsRepository unitDetailsRepository;

	@Override
	public List<UnitDetails> getUnitDetailsList() {
		
		List<UnitDetails> unitDetailsList=new ArrayList<UnitDetails>();
		
		unitDetailsList=unitDetailsRepository.findByDelStatus(0);
		
		return unitDetailsList;
	}

	@Override
	public UnitDetails save(UnitDetails unitDetails) {
		
		try {
			unitDetails=unitDetailsRepository.save(unitDetails);
		} catch (Exception e) {
			
		}
		
		return unitDetails;
	}

	
	
}
