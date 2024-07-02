package com.example.Atm.Service;

import java.util.Arrays;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;

@Service
public class ThirdPartyservice {
	
	StringBuilder st = new StringBuilder();
	String POST="/post";
	
//	public Map<String,Object> getPostValues(int id)
//	{
//		HttpEntity<Void> bl = new HttpEntity<>(gethttpHeaders());
//		StringBuilder 	url = st.append(POST);
//	}
	
	public HttpHeaders gethttpHeaders()
	{
		HttpHeaders hp = new HttpHeaders();
		hp.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		hp.setContentType(MediaType.APPLICATION_ATOM_XML.APPLICATION_JSON);
		return hp;
	}

}
