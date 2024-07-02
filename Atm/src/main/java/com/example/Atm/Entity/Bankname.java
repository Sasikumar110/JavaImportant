package com.example.Atm.Entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="bankname")
public class Bankname  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String bankname;
	private String branchname;
	private Userdetails userdetail;
	
	public Bankname()
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

	@Column(name="bankname")
	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	@Column(name="branchname")
	public String getBranchname() {
		return branchname;
	}

	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}

	@OneToOne(mappedBy = "bankname",cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	public Userdetails getUserdetail() {
		return userdetail;
	}

	public void setUserdetail(Userdetails userdetail) {
		this.userdetail = userdetail;
	}
	
	
	

}
