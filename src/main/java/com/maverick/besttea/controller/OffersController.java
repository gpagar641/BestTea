package com.maverick.besttea.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maverick.besttea.model.SupplierDetails;

@Controller
public class OffersController {

	@RequestMapping(value="/showOffers", method=RequestMethod.GET)
	public ModelAndView showOffers(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("offers/addNewOffers");
		
		
		
		return model;
		
	}	
	
}
