package com.maverick.besttea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.ItemPriceDetails;

public interface ItemPriceDetailsRepository extends JpaRepository<ItemPriceDetails, Integer>{

	ItemPriceDetails save(ItemPriceDetails itemPriceDetails);

	ItemPriceDetails findByItemIdAndDelStatus(int itemId, int delStatus);
	
}
