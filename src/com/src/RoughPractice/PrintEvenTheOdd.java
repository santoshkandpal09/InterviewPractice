package com.src.RoughPractice;

import java.util.Arrays;

public class PrintEvenTheOdd {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8,9};
		
		Arrays.stream(arr).boxed()
		.filter(e->e%2!=0).forEach(System.out::println);
		
		Arrays.stream(arr).boxed()
		.filter(e->e%2==0).forEach(System.out::println);
		
		
		
	}

}
