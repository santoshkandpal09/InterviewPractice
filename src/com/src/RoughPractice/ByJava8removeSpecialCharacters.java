package com.src.RoughPractice;

public class ByJava8removeSpecialCharacters {
	
	public static void main(String[] args) {
		String str="santo@s$&sh";
		
		String removeSpecialCharacters = str.replaceAll("[^a-zA-Z0-9- ]", " ");
		
		System.out.println(removeSpecialCharacters);
	}
	
	

}
