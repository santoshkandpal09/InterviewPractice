package com.src.code;

public class PrintWithoutSpecialCharacters {

	public static void main(String[] args) {
		String s = "cloudTech9 #@!";
		int count=0;
		String specialCharacterRemoved="";

		for (int i = 0; i < s.length(); i++) {

			if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))
					&& !Character.isWhitespace(s.charAt(i))) {
				count++;
			}
			else {
				specialCharacterRemoved=specialCharacterRemoved+s.charAt(i);
			}

		}
		
		System.out.println("special character removed: "+specialCharacterRemoved);

	}

}
