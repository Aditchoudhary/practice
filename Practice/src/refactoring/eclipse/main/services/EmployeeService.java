package refactoring.eclipse.main.services;

import refactoring.eclipse.main.model.EmployeeDetails;

public class EmployeeService {
	
	public EmployeeDetails getEmployeeObject(){
		
		EmployeeDetails e = new EmployeeDetails();
		e.sal = "200000";
		e.name  = "Adit";
		return e;				
	}
	
	

}
