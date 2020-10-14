package com.efrei.tp4jax;
//implementation

import javax.xml.ws.Endpoint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Tp4jaxApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Tp4jaxApplication.class, args);
		MyServiceWeb myServiceWeb = new MyServiceWebImpl();

		Endpoint.publish("http://localhost:8080/WS/MonServiceWeb",myServiceWeb);
	}

}