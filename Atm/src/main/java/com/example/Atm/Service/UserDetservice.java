package com.example.Atm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Atm.Entity.Userdetails;
import com.example.Atm.Repository.UserdetRepository;

@Service
public class UserDetservice {
	
	@Autowired
	private UserdetRepository userrepo;
	
	public List<Userdetails> getAllUser(Userdetails userdetails)
	{
		return userrepo.findAll();
	}

}
