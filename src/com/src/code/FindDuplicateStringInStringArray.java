package com.src.code;
	import java.util.Arrays;
	import java.util.List;
	import java.util.Map;
	import java.util.function.Function;
	import java.util.stream.Collectors;

	public class FindDuplicateStringInStringArray  {
	    public static void main(String[] args) {
	        String[] strArray = {"apple", "orange", "banana", "apple", "grape", "orange", "banana"};

	        // Count occurrences of each string using Java 8 streams
	        Map<String, Long> countMap = Arrays.stream(strArray)
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        // Filter duplicate strings (count > 1)
	        System.out.println("Duplicate strings and their counts:");
	        countMap.entrySet().stream()
	                .filter(entry -> entry.getValue() > 1)
	                .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
	    }
	}

