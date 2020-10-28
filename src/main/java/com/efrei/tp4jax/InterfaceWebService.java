package com.efrei.tp4jax;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oracle.xmlns.webservices.jaxws_databinding.ObjectFactory;

@WebService(
targetNamespace = "http://localhost:8080/WS/MonServiceWeb/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
  ObjectFactory.class
})
public interface InterfaceWebService {
	@WebMethod(
	action = "http://localhost:8080/WS/MonServiceWeb/" + "displayBirds")
	@WebResult(
	name 			= "displayBirdsResponse",
	targetNamespace = "http://localhost:8080/WS/MonServiceWeb/",
	partName 		= "parameters")
	public String displayBirds();
	//public void createEntity(@WebParam(name = "nameImport") String nameImport);

	
}
/*
@WebService(
name = "EmployeeServiceTopDown", 
targetNamespace = "http://topdown.server.jaxws.baeldung.com/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
  ObjectFactory.class
})
public interface InterfaceWebService {
  @WebMethod(
    action = "http://topdown.server.jaxws.baeldung.com/"
    + "EmployeeServiceTopDown/countEmployees")
  @WebResult(
    name = "countEmployeesResponse", 
    targetNamespace = "http://topdown.server.jaxws.baeldung.com/", 
    partName = "parameters")
  public int countEmployees();
}*/