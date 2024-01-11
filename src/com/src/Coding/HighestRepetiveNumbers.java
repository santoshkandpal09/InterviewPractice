package com.src.Coding;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestRepetiveNumbers {
	public static void main(String[] args) {
		
		int arr[]= {1,2,2,3,4,5,4,6,4};
		
		Map<Integer, Long> collect = Arrays.stream(arr).boxed().
		collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		Integer MaxRepetiveNumber = collect.entrySet().stream()
		.max((e1,e2)->e1.getValue().compareTo(e2.getValue()))
		.map(Map.Entry::getKey).orElse(null);
		
		System.out.println(MaxRepetiveNumber);
		
	}
	
	




}
