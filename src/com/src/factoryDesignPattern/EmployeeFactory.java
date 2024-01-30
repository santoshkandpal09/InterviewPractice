package com.src.factoryDesignPattern;

public class EmployeeFactory {
	
	// get the Employee
	
	public static Employee getEmployee(String empType) {
		if(empType.trim().equalsIgnoreCase("android developer")) {
			return new AndroidDeveloper();
			
		}
		else if(empType.trim().equalsIgnoreCase("web developer")) {
			return new WebDeveloper();
		}
		else {
		return null;
		}
	}

}
