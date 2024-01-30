package com.src.code.DecPractice;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,2,4,5,3,3};
		
		/*
		 * Map<Integer,Long> collect = Arrays.stream(arr).boxed().
		 * collect(Collectors.groupingBy(i->i,Collectors.counting()));
		 * 
		 * Entry<Integer, Long> maxRepetive = collect.entrySet().stream()
		 * .max((e1,e2)->e1.getValue().compareTo(e2.getValue())).orElseThrow(null);
		 * 
		 * System.out.println(maxRepetive.getKey());
		 */
		
		/*
		 * Integer max = Arrays.stream(arr).boxed().mapToInt(e->e).max().orElse(0);
		 * System.out.println(max);
		 * 
		 * 
		 */
		
		
		/*Map<Integer, Long> collect = 
				Arrays.stream(arr).boxed().
				collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		collect.entrySet().stream()
		.filter(e->e.getValue()>1)
		.forEach(e->System.out.println(" Duplicate Keywords: "+e.getKey()+
				" Repetive time: "+e.getValue()));
	}*/
		
		
		
	}

}
