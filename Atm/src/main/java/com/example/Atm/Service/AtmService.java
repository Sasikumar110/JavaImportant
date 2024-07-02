package com.example.Atm.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Atm.Entity.AtmDetailsEntity;
import com.example.Atm.Repository.AtmRepository;

@Service
public class AtmService {
	
	@Autowired
	private AtmRepository repo;
	
	public AtmDetailsEntity SaveValues(AtmDetailsEntity save)
	{  
		AtmDetailsEntity li  =  new AtmDetailsEntity();
		li.setId(save.getId());
		li.setUsername(save.getUsername());
		li.setAccountnumber(save.getAccountnumber());
		li.setPassword(save.getPassword());
		li.setPhone(save.getPhone());
		li.setPin(save.getPin());
		AtmDetailsEntity saveVal= repo.save(li);
		saveVal.setId(save.getId());
		saveVal.setUsername(save.getUsername());
		saveVal.setAccountnumber(save.getAccountnumber());
		saveVal.setPassword(save.getPassword());
		saveVal.setPhone(save.getPhone());
		saveVal.setPin(save.getPin());
		return saveVal;
		
	}
	
	public List<AtmDetailsEntity> GetAll(AtmDetailsEntity enti)
	{
		return repo.findAll();
	}
	
	
	public Optional<AtmDetailsEntity> getValue(AtmDetailsEntity value)
	{
		return repo.findUserName();
	}

}
