package com.array.assignment;

public class TimeToEquality {
	
	public static int findMax(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
				max = arr[i];
		}
		return max;
	}

	public static void main(String[] args) {
		
		int[] arr =  {2, 4, 1, 3, 2};
		int max = findMax(arr);
		int count =0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<max) {
				count = count + (max - arr[i]);
			}
		}
		System.out.println(count);
	}

}
