package com.efrei.tp4jax;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@WebService(endpointInterface = "com.efrei.tp4jax.InterfaceWebService",
targetNamespace = "http://localhost:8080/WS/MonServiceWeb/")
public class MyServiceWebImpl implements InterfaceWebService{
	BirdCage birds;

	public MyServiceWebImpl() {
		birds = new BirdCage();
		birds.addBird(new Bird(2000, 01, 01, "josé bové", Bird.MALE, "tiplouf"));
		birds.addBird(new Bird(2010, 03, 01, "m. oizo", Bird.NONBINARY, "roucool"));
		birds.addBird(new Bird(2003, 11, 01, "princesse peach", Bird.FEMALE, "la chouette efrei"));
		System.out.println("Je suis rentré dans le constructeur chéri");
	}

	@WebMethod
	public String displayBirds() {
		System.out.println("Un grand vide dans notre cœur : " + birds.toString());
		return birds.toString();
	}

	public @WebResult(name="displayBirds") void createEntity(@WebParam(name = "nameImport") String nameImport) {
		System.out.println("Un grand vide dans notre cœur : " + birds.toString());
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