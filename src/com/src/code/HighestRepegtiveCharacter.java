package com.src.code;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class HighestRepegtiveCharacter {
	public static void main(String[] args) {
	String str="capgemini";
		
		Map<Character, Long> collect = str.chars().mapToObj(ch->(char)ch).
		collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
		
		Character MaxCharacter = collect.entrySet().stream()
		.max((e1,e2)->e1.getValue().compareTo(e2.getValue()))
		.map(Map.Entry::getKey).orElse(null);
		
		System.out.println(MaxCharacter);
		
		
		
	}

}
