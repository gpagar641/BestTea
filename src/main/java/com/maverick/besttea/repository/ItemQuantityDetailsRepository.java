package com.maverick.besttea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.ItemQuantityDetails;

public interface ItemQuantityDetailsRepository extends JpaRepository<ItemQuantityDetails, Integer>{

	
	ItemQuantityDetails save(ItemQuantityDetails itemQuantityDetails);
}
