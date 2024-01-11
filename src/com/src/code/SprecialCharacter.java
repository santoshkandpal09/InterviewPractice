package com.src.code;

public class SprecialCharacter {
	
	public static void main(String[] args) {
		String s="cloudTech9 #@!";
		
		int count=0;
				
				for(int i=0;i<s.length();i++) {
					
					if(!Character.isDigit(s.charAt(i)) 
							&& !Character.isLetter(s.charAt(i)) && !Character.isWhitespace(s.charAt(i))){
								count++;
							}
					
				}
				
				if(count==0) {
					System.out.println("There is no special character");
				}
				else {
					System.out.println("Special characters are: "+count);
				}
				
				
					
	}
	
	

}
