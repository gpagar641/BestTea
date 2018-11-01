package com.maverick.besttea.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maverick.besttea.model.GetRawMateialDetailsWithUnit;
import com.maverick.besttea.model.Info;
import com.maverick.besttea.model.RawMaterialDetails;
import com.maverick.besttea.model.SupplierDetails;
import com.maverick.besttea.model.SupplierMaterialDetails;
import com.maverick.besttea.repository.GetRawMateialDetailsWithUnitRepository;
import com.maverick.besttea.repository.RawMaterialDetailsRepository;
import com.maverick.besttea.repository.SupplierDetailsRepository;
import com.maverick.besttea.repository.SupplierMaterialDetailsRepository;
import com.maverick.besttea.service.SupplierDetailsService;

	

@Service
public class SupplierDetailsServiceImpl implements SupplierDetailsService{

	@Autowired
	SupplierDetailsRepository supplierDetailsRepository; 
	
	@Autowired
	RawMaterialDetailsRepository rawMaterialDetailsRepository;
	
	@Autowired
	GetRawMateialDetailsWithUnitRepository getRawMateialDetailsWithUnitRepository;
	
	@Autowired
	SupplierMaterialDetailsRepository supplierMaterialDetailsRepository;
	
	@Override
	public SupplierDetails insertSupplier(SupplierDetails supplierDetails) {
		
		try {
			
		supplierDetails=supplierDetailsRepository.save(supplierDetails);
		Info info=new Info();
		if(supplierDetails!=null) {
			
			info.setMessage("Supplier Insert Successfully");
		}else {
			info.setError(true);
		}
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return supplierDetails;
	}

	@Override
	public RawMaterialDetails insertRawMaterial(RawMaterialDetails rawMaterialDetails) {
		
		Info info=new Info();
		
		try {
			
		rawMaterialDetails=rawMaterialDetailsRepository.save(rawMaterialDetails);

		if(rawMaterialDetails!=null) {
			info.setMessage("Raw Material Save");
		}else {
			info.setError(true);
		}
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rawMaterialDetails;
	}

	@Override
	public List<GetRawMateialDetailsWithUnit> getListOfRawMaterials() {
		// TODO Auto-generated method stub
		
		List<GetRawMateialDetailsWithUnit> getRawMateialDetailsWithUnitList=new ArrayList<GetRawMateialDetailsWithUnit>();
		
		getRawMateialDetailsWithUnitList=getRawMateialDetailsWithUnitRepository.findByDelStatus(0);
		return getRawMateialDetailsWithUnitList;
	}

	@Override
	public List<SupplierDetails> getAllSupplier() {
		// TODO Auto-generated method stub
		List<SupplierDetails> supplierDetailsList=new ArrayList<SupplierDetails>();
		
		supplierDetailsList=supplierDetailsRepository.findByDelStatus(0);
		System.out.println(supplierDetailsList.toString());
		return supplierDetailsList;
	}
   
	@Override
	public List<SupplierMaterialDetails> insertSupplierMaterial(List<SupplierMaterialDetails> supplierMaterialList) {
	 
		List<SupplierMaterialDetails> supplierMaterialDetailsList=new ArrayList<SupplierMaterialDetails>();
		try {
			supplierMaterialDetailsRepository.saveAll(supplierMaterialList);
		} catch (Exception e) {
			 System.out.println(e.getMessage());
		}
		return supplierMaterialList;
	}

}
