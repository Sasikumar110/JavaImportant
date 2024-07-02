package com.example.Atm.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Withdraw")
public class Withdraw {
	
	private int id;
	private String name;
	private long amount;
	private long accountnumber;
	
	public Withdraw()
	{
		
	}
	
	@Id
	public int getId()
	{
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	

	@Column(name="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name="amount")
	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	@Column(name="accountnumber")
	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	

}
