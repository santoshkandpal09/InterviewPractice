package com.src.abstractDesignPattern;

public class AndroidDeveloper implements Employee {

	@Override
	public int salary() {
		// TODO Auto-generated method stub
		return 5000;
	}

	@Override
	public String name() {
		System.out.println("I am Android Developer");
		
		return "ANDROID DEVELOPER";
	}

}
