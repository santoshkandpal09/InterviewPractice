package com.src.code;

public class FindLengthOfInteger {
	
	public static void main(String[] args) {
		int i=12345;
		
		int count =0;
		
		while(i>0) {
			count++;
			i=i/10;
			
		}
		System.out.println(count);
		
//		String s = Integer.toString(i);
//		
//		System.out.println(s.length());
		
		
	}

}
