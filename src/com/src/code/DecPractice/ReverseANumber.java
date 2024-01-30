package com.src.code.DecPractice;

public class ReverseANumber {
	public static void main(String[] args) {
		int num= 2356;
		
		int reverse=0;
		
		int rem=0;
		
		while(num>0) {
			
			rem=num%10;
			
			reverse=rem+reverse*10;
			num=num/10;
		}
		System.out.println(reverse);
	}

}
