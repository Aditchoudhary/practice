package refactoring.eclipse.main.controller;

import refactoring.eclipse.main.model.EmployeeDetails;
import refactoring.eclipse.main.services.EmployeeService;

public class CEmployee {

	public static void main(String[] args) {
		EmployeeService es = new EmployeeService();
		EmployeeDetails e = es.getEmployeeObject();

	}

}
