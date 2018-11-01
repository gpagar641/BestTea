package com.maverick.besttea.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.besttea.model.SaleBillDetails;
import com.maverick.besttea.model.SaleBillHeader;
import com.maverick.besttea.repository.SaleBillDetailsRepository;
import com.maverick.besttea.repository.SaleBillHeaderRepository;
import com.maverick.besttea.service.SaleBillService;

@Service
public class SaleBillServiceImpl implements SaleBillService{

	@Autowired
	SaleBillDetailsRepository saleBillDetailsRepository;
	@Autowired
	SaleBillHeaderRepository saleBillHeaderRepository;
	
	@Override
	public SaleBillHeader insert(SaleBillHeader saleBillHeader) {

		SaleBillHeader saleBillHeaderRes=new SaleBillHeader();
		
		try {
		saleBillHeaderRes=saleBillHeaderRepository.save(saleBillHeader);
		
		 for (SaleBillDetails saleBillDetails : saleBillHeader.getSaleBillDetailsList()) 
		 {
			 saleBillDetails.setSaleBillNumber(saleBillHeader.getSaleBillId());
			 try {
			 saleBillDetailsRepository.save(saleBillDetails);
			 }
			 catch (Exception e) {
				System.out.println(e.getMessage());// TODO: handle exception
			}
		 }
		 }
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		return saleBillHeaderRes;
	}

}
