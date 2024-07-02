package com.example.Atm.Controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.Atm.Entity.AtmDetailsEntity;
import com.example.Atm.Service.AtmService;

@RestController
public class AtmController {
	
	Logger logger = LoggerFactory.getLogger(AtmController.class); 
	
	@Value("${spring.application.name}")
	public String args;
	
	@Autowired
	private AtmService service;
	
	@PostMapping(value="/savevalue")
	public ResponseEntity<AtmDetailsEntity> SaveAllValues(@RequestBody AtmDetailsEntity entity)
	{
		AtmDetailsEntity atm = service.SaveValues(entity);
		return new ResponseEntity<>(atm,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/getAll",method=RequestMethod.GET)
	public ResponseEntity<List<AtmDetailsEntity>> getAllValue(AtmDetailsEntity atmvalue)
	{
		List<AtmDetailsEntity> lis = service.GetAll(atmvalue);
		List<AtmDetailsEntity> lo =lis.stream().filter(x->x.getId()>0).collect(Collectors.toList());
		return new ResponseEntity<List<AtmDetailsEntity>>(lo,HttpStatus.OK);
	}
	
	@RequestMapping(value="/getusername",method=RequestMethod.GET)
	public Optional<AtmDetailsEntity> getUsername(AtmDetailsEntity enityt)
	{
		return service.getValue(enityt);
	}
	
	
	@RequestMapping(value="/profile",method=RequestMethod.GET)
	public String getProfile()
	{
		return args;
	}
	
	

}
