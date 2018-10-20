package com.maverick.besttea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.ItemDetails;

public interface ItemDetailsRepository extends JpaRepository<ItemDetails, Integer>{

	ItemDetails save(ItemDetails itemDetails);
	
	ItemDetails findByItemId(int itemId);
	
	List<ItemDetails> findByDelStatus(int delStatus);
	
	List<ItemDetails> findByCategoryIdAndDelStatus(int categoryId,int delStatus);
	
}
