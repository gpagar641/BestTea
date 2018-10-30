package com.maverick.besttea.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.besttea.model.Info;
import com.maverick.besttea.model.ItemDetails;
import com.maverick.besttea.repository.ItemDetailsRepository;
import com.maverick.besttea.service.ItemDetailsService;

@Service
public class ItemDetailsServiceImpl implements ItemDetailsService{

	@Autowired
	ItemDetailsRepository itemDetailsRepository;
	
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

}
