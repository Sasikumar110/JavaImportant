package com.example.Atm.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SpringSecurityAuthenication extends  WebSecurityConfigurerAdapter {
	
	@Autowired
	public DataSource datasource;
	
	protected void confiqure(AuthenticationManagerBuilder auth) throws  Exception
	{
		auth.jdbcAuthentication().dataSource(datasource);
	}

}
