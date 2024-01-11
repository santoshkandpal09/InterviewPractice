package com.src.Coding;

import java.util.Arrays;

public class PrintEvenFirstThenOdd {
	
	public static void main(String[] args) {
		        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		        System.out.println("Even numbers first, then odd numbers:");

		        Arrays.stream(arr)
		                .boxed()
		                .sorted((a, b) -> Integer.compare(a % 2, b % 2))
		                .forEach(e->System.out.println(e));
		    }
		}