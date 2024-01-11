package com.src.Coding;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateStringInStringArray {
	
	public static void main(String[] args) {
		String[] strArray = {"apple", "orange", "banana", "apple", "grape", "orange", "banana"};
		
		Map<String, Long> collect = Arrays.stream(strArray).
				collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		collect.entrySet().stream()
		.filter(e1->e1.getValue()>1)
		.forEach(e1->System.out.println(e1.getKey()));
	}

}
