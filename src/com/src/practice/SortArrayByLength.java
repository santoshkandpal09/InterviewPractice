package com.src.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortArrayByLength {
	public static void main(String[] args) {
		
		  int [] arr = new int[4];
		  
		  arr[0]=1; arr[1]=333; arr[2]=22; arr[3]=4444;
		 
		// int[] arr = new int[]{1, 333, 22, 4444};
		  
		  
		   int[] array = Arrays.stream(arr).boxed().map(i->String.valueOf(i))
		  .sorted((e1,e2)->Integer.compare(e1.length(), e2.length()))
		  .mapToInt(Integer::parseInt).toArray();
		  
		  System.out.println(Arrays.toString(array));
		  
	}
		/*
		 int[] array = Arrays.stream(arr) // convert int into Integer
         .boxed().map(e->String.valueOf(e)) // convert Integer into String
         .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
         .mapToInt(Integer::parseInt)
         .toArray();


   System.out.println(Arrays.toString(array));
	}
*/
}
