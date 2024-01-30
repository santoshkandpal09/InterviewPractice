package com.src.factoryDesignPattern;

public class WebDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Getting web Developer salary");
		return 40000;
	}

}
