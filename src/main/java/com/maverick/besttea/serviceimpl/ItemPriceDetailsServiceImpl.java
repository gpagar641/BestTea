package com.maverick.besttea.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.besttea.model.Info;
import com.maverick.besttea.model.ItemPriceDetails;
import com.maverick.besttea.repository.ItemPriceDetailsRepository;
import com.maverick.besttea.service.ItemPriceDetailsService;
import com.sun.org.apache.bcel.internal.generic.RETURN;

@Service
public class ItemPriceDetailsServiceImpl implements ItemPriceDetailsService{

	@Autowired
	ItemPriceDetailsRepository itemPriceDetailsRepository;
	
	/**
	 * @author Kaushik
	 * This method is used to save insert new price.
	 */
	@Override
	public ItemPriceDetails insertItemPrice(ItemPriceDetails itemPriceDetails) {

		Info info=new Info();
		try {
			itemPriceDetails=itemPriceDetailsRepository.save(itemPriceDetails);	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		if(itemPriceDetails!=null) {
			
			info.setMessage("Price Save Successfully");
		}else {
			info.setError(true);
		}		
		return itemPriceDetails;
	}

}
