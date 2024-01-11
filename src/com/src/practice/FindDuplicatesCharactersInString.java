package com.src.practice;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesCharactersInString {
	
	public static void main(String[] args) {
		String str="santosh kandpal";
		
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c).
		collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		collect.entrySet().stream()
		.filter(entry->entry.getValue()>1)
		.forEach(entry->System.out.println(entry.getKey()));
	}

}
