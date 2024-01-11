package com.src.code;

public class PrintLowerCaseandUpperCase {
	
	public static void main(String[] args) {
		String str="My name is Bhuwan chandra kandpal";
		
		int mid= str.length()/2;
		
		String lowercase="";
		String uppercase="";
		
		for(int i=0;i<str.length();i++) {
			if(i<mid) {
				
				lowercase=lowercase+Character.toLowerCase(str.charAt(i));
			}
			else {
				uppercase=uppercase+Character.toUpperCase(str.charAt(i));
			}
		}
		
		System.out.println(lowercase+uppercase);
	}

}
