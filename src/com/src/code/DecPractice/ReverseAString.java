package com.src.code.DecPractice;

public class ReverseAString {
	public static void main(String[] args) {
		String str = "santosh";

		char[] charArray = str.toCharArray();

		for (int i = 0; i < charArray.length; i++) {
			char temp=charArray[i];
			charArray[i]=charArray[charArray.length-1];
			charArray[charArray.length-1]=temp;
			
		}
		String reversedString = new String(charArray);

        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedString);
	}

}
