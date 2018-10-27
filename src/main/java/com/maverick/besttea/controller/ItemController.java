package com.maverick.besttea.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maverick.besttea.model.ItemDetails;

@Controller
public class ItemController {

	
	@RequestMapping(value="/showItems", method=RequestMethod.GET)

	public ModelAndView showPatientLoginPage(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("items/items");
		
		List<ItemDetails> itemDetailsList=new ArrayList<ItemDetails>();
		
		
		
		return model;
		
	}	
	
	@RequestMapping(value="/showAddItems", method=RequestMethod.GET)

	public ModelAndView showAddItems(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("items/add_new_items");
		
		return model;
		
	}	
}
