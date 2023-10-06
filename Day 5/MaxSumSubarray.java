package com.array.assignment;

public class MaxSumSubarray {

	public static int findMaxSum(int[] arr) {

		int max=Integer.MIN_VALUE;
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
			if(sum<=0) {
				max = Math.max(sum, max);
				sum = 0;
			}
			else
				max = Math.max(sum, max);
			
		}
		return max;

	}

	public static void main(String[] args) {

		int[] arr= {1,2,3,9};
		System.out.println(findMaxSum(arr));

	}

}
