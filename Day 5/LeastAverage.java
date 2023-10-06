package com.array.assignment;

public class LeastAverage {
	
	public static int findIndex(int[] arr, int k) {
		int i=0,j=0;
		double sum=0;
		int index = -1;
		double avg = Integer.MAX_VALUE;
		while(i<arr.length && j<arr.length) {
			sum = sum + arr[j];
			if((j-i+1)<k) {
				
				j++;
			}
			else if((j-i+1)==k) {
				if(avg>(sum/k)) {
					avg = sum/k;
					index = i;
				}
				sum = sum - arr[i];
				i++;
				j++;
			}
		}
		return index;
	}

	public static void main(String[] args) {
		
		int[] arr = {3, 7, 90, 20, 10, 50, 40};
		System.out.println(findIndex(arr,3));
	}

}
