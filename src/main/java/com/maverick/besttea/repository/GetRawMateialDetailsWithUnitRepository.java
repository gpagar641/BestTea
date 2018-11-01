package com.maverick.besttea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.maverick.besttea.model.GetRawMateialDetailsWithUnit;

public interface GetRawMateialDetailsWithUnitRepository extends JpaRepository<GetRawMateialDetailsWithUnit, Integer>{

	@Query(value="SELECT r.raw_material_id, r.unit_id, r.material_name, r.material_desc, u.unit_name FROM raw_material r,"
			+ " unit_details u WHERE r.del_status=:delStatus AND u.unit_id=r.unit_id",nativeQuery=true)
	List<GetRawMateialDetailsWithUnit> findByDelStatus(@Param("delStatus")int delStatus);
	
}
