package com.src.revision;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestRepetiveNumber {
	
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,3,4,5,4,3,1};
		
		Map<Integer, Long> collect = Arrays.stream(arr).boxed()
		.collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		
		Integer maxEntity = collect.entrySet().stream()
		.max((e1,e2)->e1.getValue().compareTo(e2.getValue()))
		.map(e->e.getKey())
		.orElse(null);
		
		System.out.println(maxEntity);
		
				
	}

}
