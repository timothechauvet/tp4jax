package com.efrei.tp4jax;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@WebService
public interface MyServiceWeb {
	@WebMethod
	public void createEntity();

	
}
