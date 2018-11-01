package com.maverick.besttea.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.maverick.besttea.model.CustomerTableDetails;
import com.maverick.besttea.model.Info;
import com.maverick.besttea.model.ItemDetails;
import com.maverick.besttea.model.ItemPriceDetails;
import com.maverick.besttea.model.SaleBillDetails;
import com.maverick.besttea.model.SaleBillHeader;
import com.maverick.besttea.service.CustomerTableService;
import com.maverick.besttea.service.ItemDetailsService;
import com.maverick.besttea.service.SaleBillService;

@Controller
public class CustomerBillController {

	@Autowired
	ItemDetailsService itemDetailsService;
	@Autowired
	CustomerTableService customerTableService;
	@Autowired
	SaleBillService saleBillService;
	
	public List<CustomerTableDetails> customerTableDetailsList; 
	SaleBillHeader saleBillHeader;
	
	@RequestMapping(value="/showCustomerbill", method=RequestMethod.GET)

	public ModelAndView showPatientLoginPage(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("customerBill/customerBill");
		
		List<ItemDetails> itemDetailsList=itemDetailsService.getItemsDetails();
		model.addObject("itemDetailsList",itemDetailsList);
		
		  customerTableDetailsList=customerTableService.getCustomerTableDetails(0);
		model.addObject("customerTableDetailsList",customerTableDetailsList);
		
		return model;
		
	}	
	
	
	
	@RequestMapping(value="/addItemToCustomerorderList", method=RequestMethod.GET)

	public @ResponseBody List<SaleBillDetails> addItemToCustomerorderList(HttpServletRequest request)   
	{
		List<SaleBillDetails> saleBillDetailsList=new ArrayList<SaleBillDetails>();
	 
		int tableId=Integer.parseInt(request.getParameter("tableId"));
		String itemName=request.getParameter("itemName");
		int itemQty=Integer.parseInt(request.getParameter("itemQty"));
		int itemId=Integer.parseInt(request.getParameter("itemId"));
	
		for(int i=0;i<customerTableDetailsList.size();i++)
		{
			if(customerTableDetailsList.get(i).getTableId()==tableId)
			{
				saleBillHeader=customerTableDetailsList.get(i).getSaleBillHeader();
				if(saleBillHeader==null)
					saleBillHeader=new SaleBillHeader();
				if(saleBillHeader.getSaleBillDetailsList()!=null)
				saleBillDetailsList=saleBillHeader.getSaleBillDetailsList();
				ItemPriceDetails itemPriceDetails=itemDetailsService.getItemPrice(itemId);
				
				SaleBillDetails saleBillDetails=new SaleBillDetails();
				saleBillDetails.setItemId(itemId);
				saleBillDetails.setItemName(itemName);
				saleBillDetails.setQuantity(itemQty);
				saleBillDetails.setItemPrice(itemPriceDetails.getItemPrice());
				saleBillDetails.setTotalAmount((itemPriceDetails.getItemPrice())*itemQty);
				saleBillDetails.setType(0);
				saleBillDetailsList.add(saleBillDetails);
				saleBillHeader.setSaleBillDetailsList(saleBillDetailsList);
				customerTableDetailsList.get(i).setSaleBillHeader(saleBillHeader);
				break;
			}
		}
		
		return saleBillDetailsList;
	}
	
	
	@RequestMapping(value="/saveOrder", method=RequestMethod.GET)

	public @ResponseBody Info saveOrder(HttpServletRequest request)   
	{
		int tableId=Integer.parseInt(request.getParameter("tableId"));
		int discount=Integer.parseInt(request.getParameter("discount"));
		String custMobile=request.getParameter("custMobile");
		String custName=request.getParameter("custName");
		float payableAmount=Float.parseFloat(request.getParameter("payableAmount"));
		float totAmt=Float.parseFloat(request.getParameter("totAmt"));
		  
		Info info=new Info();
		  
		for(int i=0;i<customerTableDetailsList.size();i++)
		{
			if(customerTableDetailsList.get(i).getTableId()==tableId)
			{
				 
					saleBillHeader=customerTableDetailsList.get(i).getSaleBillHeader();
					saleBillHeader.setCustomerName(custName);
					saleBillHeader.setCustMobileNo(custMobile);
					saleBillHeader.setDiscount(discount);
					saleBillHeader.setPayableAmount(payableAmount);
					saleBillHeader.setTotalAmount(totAmt);
					 
					saleBillHeader.setSaleBillId(saleBillService.insert(saleBillHeader).getSaleBillId());
					 
					 customerTableDetailsList.get(i).setSaleBillHeader(new SaleBillHeader());
				break;
			}
		}
		return info;
	}
	@RequestMapping(value="/printBill", method=RequestMethod.GET)
	public ModelAndView printBill(HttpServletRequest request)   
	{
		ModelAndView model=new ModelAndView("customerBill/printBill");
		model.addObject("saleBillHeader",saleBillHeader);
		model.addObject("date",new SimpleDateFormat("dd-MM-yyyy HH:mm:ss ").format(new Date()));
		return model;
		
	}	
	
}
