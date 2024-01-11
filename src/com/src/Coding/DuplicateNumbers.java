package com.src.Coding;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,5,5,6,3,7,8,5};
		
		Map<Integer, Long> collect = 
				Arrays.stream(arr).boxed().
				collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		collect.entrySet().stream()
		.filter(entry->entry.getValue()>1)
		.forEach(entry->System.out.println("Duplicates numbers: "+entry.getKey()+" Repetive times: "+entry.getValue()));
	}
	
	
	
	

}
