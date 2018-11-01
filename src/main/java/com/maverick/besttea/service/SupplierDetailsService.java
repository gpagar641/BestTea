package com.maverick.besttea.service;

import java.util.List;

import com.maverick.besttea.model.GetRawMateialDetailsWithUnit;
import com.maverick.besttea.model.RawMaterialDetails;
import com.maverick.besttea.model.SupplierDetails;
import com.maverick.besttea.model.SupplierMaterialDetails;

public interface SupplierDetailsService {

	SupplierDetails insertSupplier(SupplierDetails supplierDetails);

	RawMaterialDetails insertRawMaterial(RawMaterialDetails rawMaterialDetails);
	
	List<GetRawMateialDetailsWithUnit> getListOfRawMaterials();
	
	List<SupplierDetails> getAllSupplier();
	
	List<SupplierMaterialDetails> insertSupplierMaterial(List<SupplierMaterialDetails> supplierMaterialList);
}
