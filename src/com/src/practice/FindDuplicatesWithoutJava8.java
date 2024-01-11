package com.src.practice;

public class FindDuplicatesWithoutJava8 {
	
	public static void main(String[] args) {
		int arr[]= {1,2,2,3,4,5,5,6,3,7,8,5};
		
		for(int i=0;i<arr.length-1;i++) {
			int temp =1;
			for(int j=i+1;j<arr.length;j++) {
				
				if(arr[i]==arr[j]) {
					temp++;
					// set the duplicates value into value which is not in array
					arr[j]=Integer.MIN_VALUE;
				}
				
				
				
			}
			if(temp>1 && arr[i]!=Integer.MIN_VALUE) {
				System.out.println("Numbers: "+arr[i]+" repeat: "+temp);
			}
		}
	}

}
