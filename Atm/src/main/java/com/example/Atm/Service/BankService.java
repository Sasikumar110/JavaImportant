package com.example.Atm.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Atm.Entity.Bankname;
import com.example.Atm.Repository.BankRepository;

@Service
public class BankService {
	
	@Autowired
	private BankRepository bankrepo;
	
	
	public List<Bankname> getAllDetails(Bankname bankname)
	{
		return bankrepo.findAll();
	}

}
