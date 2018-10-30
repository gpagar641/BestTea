package com.maverick.besttea.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.maverick.besttea.model.CategoryDetails;
import com.maverick.besttea.repository.CategoryDetailsRepository;
import com.maverick.besttea.service.CategoryDetailsService;

@Service
public class CategoryDetailsServiceImpl implements CategoryDetailsService{
	
	@Autowired
	CategoryDetailsRepository categoryDetailsRepository;
	
	@Override
	public List<CategoryDetails> getListOfCategories() {
		
		List<CategoryDetails> categoryDetailsList=new ArrayList<CategoryDetails>();
		
		categoryDetailsList=categoryDetailsRepository.findByDelStatus(0);
		
		return categoryDetailsList;
	}

}
