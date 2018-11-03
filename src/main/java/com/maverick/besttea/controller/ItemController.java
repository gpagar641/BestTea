package com.maverick.besttea.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.maverick.besttea.model.CategoryDetails;
import com.maverick.besttea.model.Info;
import com.maverick.besttea.model.ItemDetails;
import com.maverick.besttea.model.ItemPriceDetails;
import com.maverick.besttea.model.ItemQuantityDetails;
import com.maverick.besttea.model.UnitDetails;
import com.maverick.besttea.service.CategoryDetailsService;
import com.maverick.besttea.service.ItemDetailsService;
import com.maverick.besttea.service.ItemQuantityDetailsService;
import com.maverick.besttea.service.UnitDetailsService;

@Controller
public class ItemController {

	
	@Autowired
	ItemDetailsService itemDetailsService;
	
	@Autowired
	CategoryDetailsService categoryDetailsService;
	
	@Autowired
	UnitDetailsService unitDetailsService;
 
	String message;
	
	@Autowired
	ItemQuantityDetailsService itemQuantityDetailsService;
	
	@RequestMapping(value="/showItems", method=RequestMethod.GET)

	public ModelAndView showPatientLoginPage(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("items/items");
		try {
		List<ItemDetails> itemDetailsList=itemDetailsService.getItemsDetails();
		model.addObject("itemDetailsList",itemDetailsList);
		}
		catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}
		
		return model;
		
	}	
	
	@RequestMapping(value="/showAddItems", method=RequestMethod.GET)

	public ModelAndView showAddItems(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("items/add_new_items");
		
		// categoryDetailsList=new ArrayList<CategoryDetails>();
		 
		 List<CategoryDetails> categoryDetailsList=categoryDetailsService.getListOfCategories();
		 List<UnitDetails> unitDetailsList=unitDetailsService.getUnitDetailsList();
		 model.addObject("unitDetailsList",unitDetailsList);
		model.addObject("categoryDetailsList",categoryDetailsList);
		model.addObject("message",message);
		return model;
		
	}	
	
	@RequestMapping(value="/addItemProcess", method=RequestMethod.GET)

	public String addItemProcess(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("items/add_new_items");
		Info info=new Info();
		ItemDetails itemDetails=new ItemDetails();
		itemDetails.setCategoryId(Integer.parseInt(request.getParameter("catId")));
		itemDetails.setItemName(request.getParameter("itemName"));
		itemDetails.setDescription(request.getParameter("itemDesc"));
		itemDetails.setUnitId(Integer.parseInt(request.getParameter("uom")));
		itemDetails.setDelStatus(0);
		itemDetails=itemDetailsService.insertItem(itemDetails);
		if(itemDetails!=null) {
			message="Information Save Successfully";
			
		}else {
			message="Information Not Save";
		}
		return "redirect:/showAddItems";
		    
	}
	
	@RequestMapping(value="/showItemsPrice", method=RequestMethod.GET)

	public ModelAndView showItemsPrice(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("items/add_item_price");
		
		List<ItemDetails> itemDetailsList=new ArrayList<ItemDetails>();
		
		itemDetailsList=itemDetailsService.getItemsDetails();
		
		model.addObject("itemDetailsList",itemDetailsList);
		return model;
		
	}
	
	@RequestMapping(value="/addItemPrice", method=RequestMethod.GET)

	public String addItemPrice(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("items/add_new_items");
		
		ItemPriceDetails itemPriceDetails=new ItemPriceDetails();
		
		itemPriceDetails.setItemId(Integer.parseInt(request.getParameter("itemId")));
		itemPriceDetails.setItemPrice(Float.parseFloat(request.getParameter("itemPrice")));
		itemPriceDetails.setItem_desc(request.getParameter("itemPriceDesc"));
		itemPriceDetails.setDelStatus(0);
		
		itemPriceDetails=itemDetailsService.insertItemPrice(itemPriceDetails);
		
		return "redirect:/showItemsPrice";
		    
	}
	
	@RequestMapping(value="/	", method=RequestMethod.GET)

	public ModelAndView showItemQuantity(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("items/add_item_quantity");
		
		List<ItemDetails> itemDetailsList=new ArrayList<ItemDetails>();
		
		itemDetailsList=itemDetailsService.getItemsDetails();
		
		model.addObject("itemDetailsList",itemDetailsList);
		return model;
		
	}
	
	@RequestMapping(value="/addItemQuantity", method=RequestMethod.GET)

	public String addItemQuantity(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("items/add_item_quantity");
		
		ItemQuantityDetails itemQuantityDetails=new ItemQuantityDetails();
		
		itemQuantityDetails.setItemId(Integer.parseInt(request.getParameter("itemId")));
		itemQuantityDetails.setItemQuantity(Integer.parseInt(request.getParameter("itemQuantity")));
		itemQuantityDetails.setItem_desc(request.getParameter("itemQuantityDesc"));
		itemQuantityDetails.setDelStatus(0);
		
		itemQuantityDetails=itemQuantityDetailsService.insertItemQuantity(itemQuantityDetails);
		
		return "redirect:/showItemQuantity";
		    
	}
	
	
}
