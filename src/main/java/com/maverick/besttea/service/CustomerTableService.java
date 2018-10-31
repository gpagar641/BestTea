package com.maverick.besttea.service;

import java.util.List;

import com.maverick.besttea.model.CustomerTableDetails;

public interface CustomerTableService {

	CustomerTableDetails insert(CustomerTableDetails customerTableDetails);
	List<CustomerTableDetails> getCustomerTableDetails(int delStatus);
}
