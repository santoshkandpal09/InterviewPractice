package com.src.Coding;

public class Byjava8removeSpecialCharacters {
	
	public static void main(String[] args) {
		
		String str ="cloudTech9 9#@!";
		String replace = str.replaceAll("[^A-Za-z0-9- ]", "");
		
		System.out.println(replace);
	}
	
	
	

}
