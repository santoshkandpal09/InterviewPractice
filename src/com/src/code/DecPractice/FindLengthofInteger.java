package com.src.code.DecPractice;

public class FindLengthofInteger {
	public static void main(String[] args) {
		int n=23456;
		
		int length=0;
		
		while(n>0) {
			n=n/10;
			length++;
			
		}
		System.out.println(length);
	}

}
