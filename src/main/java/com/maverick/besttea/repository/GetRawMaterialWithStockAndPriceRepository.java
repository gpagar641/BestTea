package com.maverick.besttea.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.maverick.besttea.model.GetRawMaterialWithStockAndPrice;

public interface GetRawMaterialWithStockAndPriceRepository extends JpaRepository<GetRawMaterialWithStockAndPrice, Integer>{

	@Query(value="SELECT s.raw_material_id, r.material_name, s.supplier_id, COALESCE((SELECT rs.total_qty FROM raw_material_stock rs"
			+ " WHERE s.supplier_id=rs.supplier_id AND del_status=0 AND s.raw_material_id=rs.raw_material_id),0) AS total_qty,"
			+ " COALESCE((SELECT rs.new_price FROM raw_material_stock rs WHERE s.supplier_id=rs.supplier_id AND del_status=0"
			+ " AND s.raw_material_id=rs.raw_material_id),0) AS new_price FROM raw_material r, supplier_material_details s"
			+ " WHERE s.raw_material_id=r.raw_material_id AND s.supplier_id=1",nativeQuery=true)
	List<GetRawMaterialWithStockAndPrice> getRawMaterialWithStockAndPrice(@Param("supplierId")int supplierId);
	}
