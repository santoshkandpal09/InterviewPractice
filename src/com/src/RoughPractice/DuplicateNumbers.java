package com.src.RoughPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int arr[]= {1,2,3,3,5,4,5,6,3,2};
		
		Map<Integer, Long> collect = Arrays.stream(arr).boxed().
				collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		collect.entrySet().stream().filter(i->i.getValue()>1)
		.forEach(i->System.out.println(" Duplicate bumbers: "+i.getKey()
		+" Repetive Time: "+i.getValue()));
		
	}

}
