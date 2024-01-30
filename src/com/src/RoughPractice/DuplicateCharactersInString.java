package com.src.RoughPractice;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
	
	public static void main(String[] args) {
		String str="Capgermini";
		
		Map<Character, Long> collect = str.chars().mapToObj(ch->(char)ch)
		.collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		collect.entrySet().stream().filter(i->i.getValue()>1)
		.forEach(i->System.out.println(" Duplicate bumbers: "+i.getKey()
		+" Repetive Time: "+i.getValue()));
	}

}
