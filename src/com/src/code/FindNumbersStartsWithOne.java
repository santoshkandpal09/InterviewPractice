package com.src.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindNumbersStartsWithOne {

	public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 12, 23, 43, 13);

        List<Integer> numbersStartingWithOne = numbers.stream()
                .filter(number -> String.valueOf(number).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println("Numbers starting with 1: " + numbersStartingWithOne);
    }
}