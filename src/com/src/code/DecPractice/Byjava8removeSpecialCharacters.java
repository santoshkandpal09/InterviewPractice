package com.src.code.DecPractice;

public class Byjava8removeSpecialCharacters {
	
	public static void main(String[] args) {
		String str ="San@$t&^sh";
		
		String removeSpecialCharacter = str.replaceAll("[^a-zA-Z0-9- ]","");
		System.out.println(removeSpecialCharacter);
		
		// Print special characters
		
		String printSpecialcharacters = str.replaceAll("[a-zA-Z0-9]", "");
		System.out.println(printSpecialcharacters);
	}

}
