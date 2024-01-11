package com.src.code;

public class RoationofStringisorNot {
	
	public static void main(String[] args) {
		String str1="ABCD";
		String str2="CDAB";
		
		if(isRotation(str1,str2)){
			System.out.println("Rotation of String is present");
		}
		else {
			System.out.println("Rotation not found");
		}
		
	}
	
	public static boolean isRotation(String str1,String str2) {
		
		return (str1.length()==str2.length()) && ((str1+str2).indexOf(str2)!=-1);
	}

}
