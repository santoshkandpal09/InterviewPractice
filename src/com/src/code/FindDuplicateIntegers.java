package com.src.code;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateIntegers {
	public static void main(String[] args) {
		int arr[]={1,2,3,4,3,5,6,5,6,7,6};

		Map<Integer,Long> duplicateNumber=
				Arrays.stream(arr).boxed().
				collect(Collectors.groupingBy(i->i,Collectors.counting()));

		duplicateNumber.entrySet().stream()
		.filter(entry->entry.getValue()>1)
		.forEach(entry->System.out.println(entry.getKey()+" "+entry.getValue()));
		
	}
}