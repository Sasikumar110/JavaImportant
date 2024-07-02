package com.example.Atm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.Atm.Entity.Bankname;
import com.example.Atm.Service.BankService;

@RestController
public class BankController {
	
	@Autowired
	private BankService bankservice;
	
	@RequestMapping(value="/getbank",method = RequestMethod.GET)
	public List<Bankname> getAllDetails(Bankname bankname)
	{
		return bankservice.getAllDetails(bankname);
	}
	
	

}
