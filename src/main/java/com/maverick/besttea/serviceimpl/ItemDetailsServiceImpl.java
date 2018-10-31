package com.maverick.besttea.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.besttea.model.Info;
import com.maverick.besttea.model.ItemDetails;
import com.maverick.besttea.model.ItemPriceDetails;
import com.maverick.besttea.repository.ItemDetailsRepository;
import com.maverick.besttea.repository.ItemPriceDetailsRepository;
import com.maverick.besttea.service.ItemDetailsService;

@Service
public class ItemDetailsServiceImpl implements ItemDetailsService{

	@Autowired
	ItemDetailsRepository itemDetailsRepository;
	
	@Autowired
	ItemPriceDetailsRepository itemPriceDetailsRepository;
	
	@Override
	public ItemDetails insertItem(ItemDetails itemDetails) {
		// TODO Auto-generated method stub
		Info info=new Info();
		ItemDetails itemDetailsRes=new ItemDetails();
		try {
			itemDetailsRes=itemDetailsRepository.save(itemDetails);	
			if(itemDetailsRes!=null) {
				info.setMessage("Item Insert Successfully");	
			}else {
				info.setError(true);
			}
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return itemDetailsRes;
	}

	@Override
	public List<ItemDetails> getItemsDetails() {
		// TODO Auto-generated method stub
		
		List<ItemDetails> itemDetailsList=new ArrayList<ItemDetails>();
		try {
			 itemDetailsList=itemDetailsRepository.findByDelStatus(0);	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return itemDetailsList;
	}

	
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

	@Override
	public ItemPriceDetails getItemPrice(int itemId) {
		ItemPriceDetails itemPriceDetails=new ItemPriceDetails();
		try {
			itemPriceDetails=itemPriceDetailsRepository.findByItemIdAndDelStatus(itemId, 0);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return itemPriceDetails;
	}

}
