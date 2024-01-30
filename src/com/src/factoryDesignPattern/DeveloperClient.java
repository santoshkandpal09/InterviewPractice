package com.src.factoryDesignPattern;

public class DeveloperClient {
	
	public static void main(String[] args) {
		
		Employee employee = EmployeeFactory.getEmployee("android developer");
		int salary = employee.salary();
		System.out.println("Salary of developer: "+salary);
		
		
		Employee employee2 = EmployeeFactory.getEmployee("web developer");
		int salary2 = employee2.salary();
		System.out.println("Salary of developer: "+salary2);
	}

}
