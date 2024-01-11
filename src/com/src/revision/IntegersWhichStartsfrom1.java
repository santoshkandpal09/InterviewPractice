package com.src.revision;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntegersWhichStartsfrom1 {
	
	public static void main(String[] args) {
		List<Integer> num = List.of(21,22,123,421,1234,1423,321,1);
		
		num.stream()
				.filter(i->String.valueOf(i).startsWith("1"))
				.forEach(System.out::println);
		
		
	}

}
