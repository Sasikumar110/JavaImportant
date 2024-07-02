package com.example.Atm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Atm.Entity.Userdetails;
import com.example.Atm.Service.UserDetservice;

@RestController
public class UserDetController {
	
	@Autowired
	private UserDetservice userservice;
	
	
	@RequestMapping(value="/getUserVal",method=RequestMethod.GET)
	public ResponseEntity<List<Userdetails>> getAllCondtion(Userdetails userdetails)
	{
		List<Userdetails> li = userservice.getAllUser(userdetails);
		return new ResponseEntity<List<Userdetails>>(li,HttpStatus.OK);
	}

}
