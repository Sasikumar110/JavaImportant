package com.example.Atm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ThirdPartyController {
	
	@Autowired
	public RestTemplate resttemplate;
	
	
	@RequestMapping(value="/thirdGet",method=RequestMethod.GET)
	public String getThirdApi()
	{
	  String s="https://jsonplaceholder.typicode.com/users";
	  return resttemplate.getForObject(s, String.class);
	}
	
	@RequestMapping(value="idvale",method=RequestMethod.GET)
	public String getThidid()
	{
		String s= "https://jsonplaceholder.typicode.com/posts";
		return resttemplate.getForObject(s, String.class);
		
	}

}
