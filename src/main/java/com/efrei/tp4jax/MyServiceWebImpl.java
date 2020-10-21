package com.efrei.tp4jax;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@WebService(endpointInterface = "com.efrei.tp4jax.MyServiceWeb",
targetNamespace = "http://localhost:8080/WS/MonServiceWeb/")
public class MyServiceWebImpl implements InterfaceWebService{
	@WebMethod
	public void displayBirds() {
		//code
	}
	public @WebResult(name="bird") void createEntity(@WebParam(name = "nameImport") String nameImport) {
		Bird birdy = new Bird(nameImport);
		System.out.println("Un grand vide dans notre cœur : " + birdy.toString());
	}
}
/*@WebService(
name = "EmployeeServiceTopDown", 
endpointInterface = "com.baeldung.jaxws.server.topdown.EmployeeServiceTopDown",
targetNamespace = "http://topdown.server.jaxws.baeldung.com/")
public class EmployeeServiceTopDownImpl 
implements EmployeeServiceTopDown {

  @Inject 
  private EmployeeRepository employeeRepositoryImpl;

  @WebMethod
  public int countEmployees() {
      return employeeRepositoryImpl.count();
  }
}*/