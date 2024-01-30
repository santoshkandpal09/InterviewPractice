package com.src.practice;

import java.util.Map;
import java.util.stream.Collectors;

public class MaxRepetiveCharacterInString {
	
	public static void main(String[] args) {
		
		String str="CapgeminiCapgemini";
		
		Map<Character, Long> collect = str.chars().mapToObj(ch->(char)ch).
		collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		Character maxRepetive = collect.entrySet().stream()
		.max((e1,e2)->e1.getValue().compareTo(e2.getValue()))
		.map(Map.Entry::getKey).orElse(null);
		
		System.out.println(maxRepetive);
	}

}
