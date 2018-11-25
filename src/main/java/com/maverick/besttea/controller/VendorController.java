package com.maverick.besttea.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.maverick.besttea.common.VpsImageUpload;
import com.maverick.besttea.model.VendorDetails;
import com.maverick.besttea.service.VendorDetailsService;

@Controller
public class VendorController {

	
	@Autowired
	VendorDetailsService vendorDetailsService;
	
	@RequestMapping(value="/showVendorRegistration", method=RequestMethod.GET)

	public ModelAndView showPatientLoginPage(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("vendor/vendor_registration");
		
		return model;
		
	}	
	
	@RequestMapping(value="/vendorRegistrationProcess", method=RequestMethod.POST)

	public String vendorRegistrationProcess(HttpServletRequest request,@RequestParam("drivingLicense") MultipartFile drivingLicense)   
	{
		ModelAndView model=new ModelAndView("vendor/vendor_registration");
		System.out.println("efferf");
	
		try {
			
			VendorDetails vendorDetails=new VendorDetails();
			vendorDetails.setName(request.getParameter("name"));
			vendorDetails.setEmail(request.getParameter("email"));
			vendorDetails.setMobile(request.getParameter("phone"));
			vendorDetails.setPassword(request.getParameter("password"));
			vendorDetails.setAddress(request.getParameter("address"));
			vendorDetails.setNickName(request.getParameter("nickname"));
			vendorDetails.setDrivingLicPic(request.getParameter("drivingfile"));
			vendorDetails.setProfilePic("");
			vendorDetails.setDelStatus(0);
			vendorDetails.setOtherDocPic("");
		
			System.out.println(vendorDetails.toString());
			vendorDetails=vendorDetailsService.insertVendor(vendorDetails);
			try {
				
			String fileName=drivingLicense.getOriginalFilename();
			VpsImageUpload vpsImageUpload=new VpsImageUpload();
			vpsImageUpload.saveUploadedFiles(drivingLicense, 1, fileName, vendorDetails.getVendorId());

			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		return "redirect:/showVendorRegistration";
		
	}	
	
	@RequestMapping(value="/showVendorDetailsById", method=RequestMethod.GET)

	public ModelAndView showVendorDetailsById(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("vendor/view_profile");
		VendorDetails vendorDetails=new VendorDetails();
		int vendorId=Integer.parseInt(request.getParameter("vendorId"));
		
		try {
			vendorDetails=vendorDetailsService.getVendorDetailsByVendorId(vendorId);
			model.addObject("vendorDetails", vendorDetails);
			model.addObject("path", VpsImageUpload.doctorImages);
			System.out.println(vendorDetails);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return model;
		
	}	
	
	@RequestMapping(value="/showAllVendor", method=RequestMethod.GET)
	public ModelAndView getVendorDetailsById(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("vendor/all_vendor");
		List<VendorDetails> vendorDetailsList=new ArrayList<>();
		try {
			vendorDetailsList=vendorDetailsService.getAllVendorDetails();
			
			model.addObject("vendorDetailsList",vendorDetailsList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return model;
		
	}	
	
	
}
