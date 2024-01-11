package com.src.Coding;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateCharacterInString {
	public static void main(String[] args) {
		String str="Santosh kandpal";
		
		Map<Character, Long> collect = str.chars().mapToObj(ch->(char)ch).
		collect(Collectors.groupingBy(ch->ch,Collectors.counting()));
		
		collect.entrySet().stream()
		.filter(entry->entry.getValue()>1)
		.forEach(entry->System.out.println("Repetive characters: "
		+entry.getKey()+" counting: "+entry.getValue()));
	}

}
