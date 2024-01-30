package com.src.abstractDesignPattern;

public class EmployeeFactory {
	
	public static Employee getEmployee(EmployeeAbstractFactory factory)
	{
		return factory.createEmployee();
		
	}
}
