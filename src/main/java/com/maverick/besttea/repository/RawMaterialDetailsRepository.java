package com.maverick.besttea.repository;

import java.util.List;

import javax.websocket.server.PathParam;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.maverick.besttea.model.RawMaterialDetails;
import com.maverick.besttea.model.GetRawMateialDetailsWithUnit;

public interface RawMaterialDetailsRepository extends JpaRepository<RawMaterialDetails, Integer>{

	RawMaterialDetails save(RawMaterialDetails rawMaterialDetails);
	
	
}
