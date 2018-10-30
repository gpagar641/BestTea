package com.maverick.besttea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.CategoryDetails;

public interface CategoryDetailsRepository extends JpaRepository<CategoryDetails, Integer>{
	
	List<CategoryDetails> findByDelStatus(int delStatus);

}
