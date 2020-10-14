package com.efrei.tp4jax;

import javax.jws.WebService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@WebService(endpointInterface = "com.efrei.tp4jax.MyServiceWeb")
public class MyServiceWebImpl implements MyServiceWeb{

	@Override
	public void createEntity() {
		// TODO Auto-generated method stub
		
	}
	
// …
}
