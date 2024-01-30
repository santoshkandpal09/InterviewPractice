package com.src.RoughPractice;

import java.util.Arrays;

public class FindNumbersStartsWithOne {
	
	public static void main(String[] args) {
		int arr[]= {112,231,412,1121,12,981};
		
		Arrays.stream(arr).boxed().filter(e->String.valueOf(e).startsWith("1"))
		.forEach(System.out::println);
		
	}

}
