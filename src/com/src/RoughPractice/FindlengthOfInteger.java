package com.src.RoughPractice;

public class FindlengthOfInteger {
	
	public static void main(String[] args) {
		long num=5436149894L;
		
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println(count);
	}

}
