package com.src.code;

import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesCharactersInString {
	public static void main(String[] args) {
		String str="Santosh kandpal";

		Map<Character,Long> duplicatesCharacters =str.chars().
				mapToObj(ch->(char)ch).collect(Collectors.groupingBy(i->i,Collectors.counting()));

		duplicatesCharacters.entrySet().stream()
		.filter(entry->entry.getValue()>1)
		.forEach(entry->System.out.println
				("Repeated Characters: "+entry.getKey()+" counting: "+entry.getValue()));
	}

}
