package com.efrei.tp4jax;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@WebService(endpointInterface = "com.efrei.tp4jax.MyServiceWeb")
public class MyServiceWebImpl implements MyServiceWeb{
	@WebMethod
	public @WebResult(name="bird") void createEntity(@WebParam(name = "nameImport") String nameImport) {
		Bird birdy = new Bird(nameImport);
		System.out.println("Un grand vide dans notre cœur : " + birdy.toString());
	}
}
