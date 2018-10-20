package com.maverick.besttea.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maverick.besttea.model.CategoryDetails;
import com.maverick.besttea.model.ItemDetails;

@Controller
public class CategoryController {


	@RequestMapping(value="/showAllCategory", method=RequestMethod.GET)

	public ModelAndView showPatientLoginPage(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("category/item-categories");
				
		return model;
		
	}	
	
}
