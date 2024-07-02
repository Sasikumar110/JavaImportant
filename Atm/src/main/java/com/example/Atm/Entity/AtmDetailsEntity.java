package com.example.Atm.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "atmmachine")
public class AtmDetailsEntity {
	
	private int id;
	private String username;
	private String password;
	private long pin;
	private long phone;
	private long accountnumber;
	private List<Withdraw> withdraw;
	
	public AtmDetailsEntity()
	{
		
	}
	
	public AtmDetailsEntity(int id, String username, String password, long pin, long phone, long accountnumber) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.pin = pin;
		this.phone = phone;
		this.accountnumber = accountnumber;
	}
	
	public AtmDetailsEntity(AtmDetailsEntity atm)
	{
		
	}

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="username")
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name="password")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="pin")
	public long getPin() {
		return pin;
	}

	public void setPin(long pin) {
		this.pin = pin;
	}

	@Column(name="phone")
	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	@Column(name="accountnumber")
	public long getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="id")
	public List<Withdraw> getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(List<Withdraw> withdraw) {
		this.withdraw = withdraw;
	}
		
	

}
