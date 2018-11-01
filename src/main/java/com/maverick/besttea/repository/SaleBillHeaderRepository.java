package com.maverick.besttea.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maverick.besttea.model.SaleBillHeader;

public interface SaleBillHeaderRepository extends JpaRepository<SaleBillHeader, Integer>{

	SaleBillHeader save(SaleBillHeader saleBillHeader);
}
