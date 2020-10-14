package com.efrei.tp4jax;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface InterfaceWebService {
	@WebMethod
	public void createEntity();
}
