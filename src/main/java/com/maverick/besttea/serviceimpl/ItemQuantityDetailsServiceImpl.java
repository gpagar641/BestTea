package com.maverick.besttea.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.besttea.model.ItemQuantityDetails;
import com.maverick.besttea.repository.ItemQuantityDetailsRepository;
import com.maverick.besttea.service.ItemQuantityDetailsService;

@Service
public class ItemQuantityDetailsServiceImpl implements ItemQuantityDetailsService{

	@Autowired
	ItemQuantityDetailsRepository itemQuantityDetailsRepository;
	
	@Override
	public ItemQuantityDetails insertItemQuantity(ItemQuantityDetails itemQuantityDetails) {
		// TODO Auto-generated method stub
		
	//	ItemQuantityDetails itemQuantityDetails=new ItemQuantityDetails();
		try {
			
			itemQuantityDetails=itemQuantityDetailsRepository.save(itemQuantityDetails);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return itemQuantityDetails;
	}

	
	
}
