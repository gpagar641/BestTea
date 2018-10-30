package com.maverick.besttea.service;

import java.util.List;

import com.maverick.besttea.model.ItemDetails;

public interface ItemDetailsService {

	ItemDetails insertItem(ItemDetails itemDetails);
	
	List<ItemDetails> getItemsDetails();
}
