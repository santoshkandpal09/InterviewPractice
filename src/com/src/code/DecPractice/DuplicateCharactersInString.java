package com.src.code.DecPractice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class DuplicateCharactersInString {
	public static void main(String[] args) {
		String str="capgeminicapgemini";
		
		Map<Character, Long> collect = str.chars().mapToObj(ch->(char)ch).
		collect(Collectors.groupingBy(i->i,Collectors.counting()));
		
		Optional<Entry<Character, Long>> max = collect.entrySet().stream().
				max((e1,e2)->Long.compare(e1.getValue(), e2.getValue()));
		
			System.out.println(max);
		
		
		
		/*
		 * Map<Character, Long> collect = str.chars().mapToObj(ch->(char)ch).
		 * collect(Collectors.groupingBy(i->i,Collectors.counting()));
		 * 
		 * collect.entrySet().stream() .filter(i->i.getValue()>1)
		 * .forEach(e->System.out.println("Repetive Characters are: "+e.getKey()+
		 * " Repetive time: "+e.getValue()));
		 */
	}

}
