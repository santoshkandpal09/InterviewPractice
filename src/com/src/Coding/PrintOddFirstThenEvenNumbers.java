package com.src.Coding;

import java.util.Arrays;

public class PrintOddFirstThenEvenNumbers {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

	        System.out.println("First odd numbers, then even numbers:");

	        Arrays.stream(arr)
	                .boxed()
	                .filter(n -> n % 2 != 0)
	                .forEach(System.out::println);

	        Arrays.stream(arr)
	                .boxed()
	                .filter(n -> n % 2 == 0)
	                .forEach(System.out::println);
	    }
	}

