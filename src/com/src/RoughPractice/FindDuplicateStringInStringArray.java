package com.src.RoughPractice;

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
		  .filter(e->e.getValue()>1)
		  .forEach(e->System.out.println(" Duplicate String:"+e.getKey()+" counting:"+e.getValue()));
	}

}
