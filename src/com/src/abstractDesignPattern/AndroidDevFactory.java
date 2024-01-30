package com.src.abstractDesignPattern;

public class AndroidDevFactory  extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
	
		return new AndroidDeveloper() ;
	}
	
	

}
