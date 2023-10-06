package com.array.assignment;

public class TotalSumSubArray {
	
	public static long findTotalSum(int[] arr) {
		long sum=0;
		for(int i=0;i<arr.length;i++) {
			
			int c = (i+1)*(arr.length-i);
			sum = sum + c*arr[i];
			
		}
		
		return sum;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3};
		System.out.println(findTotalSum(arr));

	}

}
