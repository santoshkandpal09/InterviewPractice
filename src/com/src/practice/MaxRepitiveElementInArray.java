package com.src.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxRepitiveElementInArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,2,3,4,3,3,5,6,1,2,3};
		
		
		Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect
				(Collectors.groupingBy(e->e,Collectors.counting()));
		
		Integer maxRepetiveNumber = collect.entrySet().stream()
		.max((e1,e2)->e1.getValue().compareTo(e2.getValue()))
		.map(Map.Entry::getKey).orElse(0);
		
		System.out.println(maxRepetiveNumber);
		
		
		/*
		 * Map<Integer, Long> collect = Arrays.stream(arr).boxed()
		 * .collect(Collectors.groupingBy(e->e,Collectors.counting()));
		 * 
		 * Integer maxRepitiveNumber = collect.entrySet().stream()
		 * .max((e1,e2)->e1.getValue().compareTo(e2.getValue()))
		 * .map(Map.Entry::getKey).orElse(null);
		 * 
		 * System.out.println(maxRepitiveNumber);
		 */
	}
	
}
