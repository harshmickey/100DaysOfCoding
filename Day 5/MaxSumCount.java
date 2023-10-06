package com.array.assignment;

public class MaxSumCount {
	
	
	public static int[] prefix_Sum(int[] arr) {
		int prefixArray[] = new int[arr.length];
		prefixArray[0]=arr[0];
		for(int i=1;i<prefixArray.length;i++) {
			
			prefixArray[i] = arr[i]+prefixArray[i-1];
		}
		
		return prefixArray;
	}
    public static int solve(int[] arr, int k) {

        int count=0;
		int sum=0;
		int[] arr1 = prefix_Sum(arr);
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				
				if(i==0) {
					
					sum = arr1[j];
				}
				else
					sum = arr1[j] - arr1[i-1];
				if(sum<k) {
					
					count++;
					
				}
				sum =0;
			}
			
		}
		return count;
    }
	public static void main(String[] args) {
		int[] arr = {15, 8, 16};
		System.out.println(solve(arr,242));

	}

}
