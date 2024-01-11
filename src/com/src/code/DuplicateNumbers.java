package com.src.code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	
	public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 5, 5, 6,5};

        for (int i = 0; i < arr.length; i++) {
        	int temp =1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                	temp++;
                	
                	// Set the duplicate element to a value that won't occur in the array
                	arr[j] = Integer.MIN_VALUE;
 
                }
            }
            if(temp>1 && arr[i] != Integer.MIN_VALUE) {
            	 System.out.println(arr[i] + " "+" repeated time: " +temp);
            }
           
        }
    }

		
//		Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting()));
//		
//		
//		String[] chandraArray= {"chandra","santhosh","santhosh"};
//		
//		
//		List<String> StringList= new ArrayList<>();
//		
//		List<String> asList = Arrays.asList(chandraArray); //convert string array to arrayList
//		
//		
//		for(String s : chandraArray) {
//			StringList.add(s);
//		}
//		StringList.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()));
//		
//		
//		
//		
//		int arr[]= {1,2,2,3,4,5,5,6};
		
		
		
		
		
		
		
		
		
//		List<Integer> list = List.of(1,2,2,3,4,5,5,6);
//		Map<Integer, Long> collect = list.stream().collect
//				(Collectors.groupingBy(i->i,Collectors.counting()));
//		 List<Entry<Integer, Long>> duplicatesNumbers = collect.entrySet().stream()
//			.filter(i->i.getValue()>1).collect(Collectors.toList());
//								System.out.println("Duplicates Numbers are: "+duplicatesNumbers);
//								
								
			
			}
			
		
//		Integer arr[]= {1,2,2,3,4,5,5,6};
//		
//		Map<Integer, Long> collect = Arrays.stream(arr).
//				collect(Collectors.groupingBy(i->i,Collectors.counting()));
//		
//		List<Entry<Integer, Long>> duplicatesNumbers = collect.entrySet().stream()
//		.filter(i->i.getValue()>1).collect(Collectors.toList());
//		
//		System.out.println("Duplicates Numbers are: "+duplicatesNumbers);
	
	
