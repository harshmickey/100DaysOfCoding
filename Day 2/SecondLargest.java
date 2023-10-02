package com.array.assignment;

public class SecondLargest {

	public static int secondLargest(int[] arr) {

		int largestElement = Integer.MIN_VALUE;
		int secondLargestElement = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++) {

			if(arr[i]>largestElement) {
				secondLargestElement = largestElement;
				largestElement = arr[i];

			}
			
			else if(arr[i]==largestElement) {

				secondLargestElement = arr[i];
			} 
			
			if(arr[i]<largestElement && arr[i]>secondLargestElement) {

				secondLargestElement = arr[i];
			}
			
		}

		return secondLargestElement;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,3};
		System.out.println(secondLargest(arr));
	}

}
