package com.src.abstractDesignPattern;

public class WebDeveloper implements Employee {

	@Override
	public int salary() {
		return 4000;
	}

	@Override
	public String name() {
	System.out.println("I am a Web Developer");
		return "WEB DEVELOPER";
	}

}
