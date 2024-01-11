package com.src.practice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicateStringInStringArray {
	
	public static void main(String[] args) {
		String str[]= {"sumit","santosh","sumit"};
		
		Map<String, Long> collect = Arrays.stream(str).collect
		(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("Duplicate strings and their counts:");
		collect.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    

}

}
