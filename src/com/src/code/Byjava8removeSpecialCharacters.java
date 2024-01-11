package com.src.code;

public class Byjava8removeSpecialCharacters {
	
	public static void main(String[] args) {
		String s = "cloudTech9 9#@!";
		
		String result = s.replaceAll("[^a-zA-Z0-9- ]", "");
		
		
		
		System.out.println(result);
	}

}
