package com.src.ScbPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class findconcurrency {
	
	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(1,2,2,3,5,5,7,8,8,6,8);
		
		Map<Integer, Long> concurrenceNumbers = asList.stream().
		collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		concurrenceNumbers.entrySet().stream()
		.filter(e->e.getValue()>1)
		.forEach(e->System.out.println("Repeated Number: "
				+ " "+e.getKey()+" Repeated Time: "+e.getValue()));
	}

}
