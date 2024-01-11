package com.src.practice;

public class Byjava8removeSpecialCharacters {
	
	public static void main(String[] args) {
		String str="Sumit@k$m! arverma ";
		
		String replaceAll = str.replaceAll("[^a-zA-Z0-9- ]", "");
		
		System.out.println(replaceAll);
		
	}
	
	

}
