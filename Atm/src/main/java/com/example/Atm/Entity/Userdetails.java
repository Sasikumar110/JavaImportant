package com.example.Atm.Entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userdetails")
public class Userdetails implements Serializable{
    

	private static final long serialVersionUID = 1L;
	
	private int id;
	 private long accountnumber;
	 private String username;
	 private String address;
	 private String country;
	 private Bankname bankname;
	 
	 public Userdetails()
	 {
		 
	 }

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="accountnumber")
	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	@Column(name="username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name="country")
	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}


	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	@MapsId
	public Bankname getBankname() {
		return bankname;
	}


	public void setBankname(Bankname bankname) {
		this.bankname = bankname;
	}
	 
	 
	
	 
}
