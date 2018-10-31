package com.maverick.besttea.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.besttea.model.CustomerTableDetails;
import com.maverick.besttea.repository.CustomerTableDetailsRepository;
import com.maverick.besttea.service.CustomerTableService;

@Service
public class CustomerTableServiceImpl implements CustomerTableService{

	@Autowired
	CustomerTableDetailsRepository customerTableDetailsRepository;
	
	
	@Override
	public CustomerTableDetails insert(CustomerTableDetails customerTableDetails) {
		return customerTableDetailsRepository.save(customerTableDetails);
	}

	@Override
	public List<CustomerTableDetails> getCustomerTableDetails(int delStatus) {
		 
		return customerTableDetailsRepository.findByDelStatus(delStatus);
				
	}

}
