package com.maverick.besttea.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maverick.besttea.model.GetRawMateialDetailsWithUnit;
import com.maverick.besttea.model.RawMaterialDetails;
import com.maverick.besttea.model.SupplierDetails;
import com.maverick.besttea.model.SupplierMaterialDetails;
import com.maverick.besttea.model.UnitDetails;
import com.maverick.besttea.service.SupplierDetailsService;
import com.maverick.besttea.service.UnitDetailsService;

@Controller
public class SupplierController {

	@Autowired
	UnitDetailsService unitDetailsService;
	
	@Autowired
	SupplierDetailsService supplierDetailsService;
	
	
	String message;
	
	@RequestMapping(value="/insertSupplier", method=RequestMethod.GET)
	public ModelAndView insertSupplier(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("suppliers/add_supplier");
		
		List<SupplierDetails> supplierDetailsList=new ArrayList<SupplierDetails>();
		
		model.addObject("message",message);
		
		return model;
		
	}	
	
	@RequestMapping(value="/insertSupplierProcess", method=RequestMethod.GET)

	public String insertSupplierProcess(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("suppliers/add_supplier");
		
		SupplierDetails supplierDetails=new SupplierDetails();
		supplierDetails.setSupplierName(request.getParameter("supplierName"));
		supplierDetails.setCompanyName(request.getParameter("companyName"));
		supplierDetails.setContactNo(request.getParameter("mobileNumber"));
		supplierDetails.setAddress(request.getParameter("address"));
		supplierDetails.setEmail(request.getParameter("email"));
		supplierDetails.setGstNumber(request.getParameter("gstNo"));
		supplierDetails.setDelStatus(0);
		supplierDetails=supplierDetailsService.insertSupplier(supplierDetails);
		message="Information Save Successfully";
		return "redirect:/insertSupplier";
		    
	}
	
	@RequestMapping(value="/insertRawMaterial", method=RequestMethod.GET)
	public ModelAndView insertRawMaterial(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("suppliers/add_raw_material");
		
	 RawMaterialDetails rawMaterialDetails=new RawMaterialDetails();
	
	 List<UnitDetails> unitDetailsList=unitDetailsService.getUnitDetailsList();
	
	 model.addObject("unitDetailsList",unitDetailsList);
		
	return model;
		
	}	
	
	@RequestMapping(value="/insertRawMaterialProcess", method=RequestMethod.GET)
	public ModelAndView insertRawMaterialProcess(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("suppliers/add_raw_material");
		
	 RawMaterialDetails rawMaterialDetails=new RawMaterialDetails();
		
	 rawMaterialDetails.setMaterialName(request.getParameter("materialName"));
	 rawMaterialDetails.setUnitId(Integer.parseInt(request.getParameter("uom")));
	 rawMaterialDetails.setMaterialDesc(request.getParameter("materialDesc"));
	 rawMaterialDetails.setDelStatus(0);
	 rawMaterialDetails=supplierDetailsService.insertRawMaterial(rawMaterialDetails);
	 
	 List<UnitDetails> unitDetailsList=unitDetailsService.getUnitDetailsList();
	
	 
	 model.addObject("unitDetailsList",unitDetailsList);
		
	return model;
		
	}	
	
	@RequestMapping(value="/showSupplierMaterial", method=RequestMethod.GET)
	public ModelAndView showSupplierMaterial(HttpServletRequest request)   
	{
	 ModelAndView model=new ModelAndView("suppliers/supplierMaterial");
		
	 List<GetRawMateialDetailsWithUnit> getRawMateialDetailsWithUnitList=supplierDetailsService.getListOfRawMaterials();
	
	 List<SupplierDetails> supplierDetailsList=supplierDetailsService.getAllSupplier();
	 
	 model.addObject("supplierDetailsList",supplierDetailsList);
	 model.addObject("getRawMateialDetailsWithUnitList",getRawMateialDetailsWithUnitList);
		
	return model;
		
	}	
	
	@RequestMapping(value="/insertSupplierMaterialProcess", method=RequestMethod.GET)
	public String insertSupplierMaterialProcess(HttpServletRequest request)   
	{
		
		SupplierMaterialDetails supplierMaterialDetails;
		List<SupplierMaterialDetails> supplierMaterialDetailsList = new ArrayList<SupplierMaterialDetails>();;
		String[] materialIds=request.getParameterValues("selectedMaterial");
		
		for(int i=0;i<materialIds.length;i++) {
			supplierMaterialDetails=new SupplierMaterialDetails();
			
			supplierMaterialDetails.setSupplierId(Integer.parseInt(request.getParameter("supplierId")));
			supplierMaterialDetails.setRawMaterialId(Integer.parseInt(materialIds[i]));
			supplierMaterialDetails.setDelStatus(0);
			supplierMaterialDetailsList.add(supplierMaterialDetails);
		}
		System.out.println(supplierMaterialDetailsList.toString());
		try {
			
		supplierMaterialDetailsList=supplierDetailsService.insertSupplierMaterial(supplierMaterialDetailsList);
		if(supplierMaterialDetailsList.isEmpty()) {
			
			message="Data Not Save";
			System.out.println(message);
		}else {
			message="Data Save Successfully";
		}

		} catch (Exception e) {
		e.printStackTrace();
		}
	return "redirect:/showSupplierMaterial";
		
	}	
	
	
	
}
