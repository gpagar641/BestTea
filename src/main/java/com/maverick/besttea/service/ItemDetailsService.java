package com.maverick.besttea.service;

import java.util.List;

import com.maverick.besttea.model.ItemDetails;
import com.maverick.besttea.model.ItemPriceDetails;

public interface ItemDetailsService {

	ItemDetails insertItem(ItemDetails itemDetails);
	
	List<ItemDetails> getItemsDetails();
	ItemPriceDetails insertItemPrice(ItemPriceDetails itemPriceDetails);
	ItemPriceDetails getItemPrice(int itemId);
}
