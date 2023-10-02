package com.array.assignment;

public class MinimumPicks {
	
	
	public static int findDiff(int[] arr) {
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
				
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]%2==0 && arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]%2!=0 && arr[i]<min) {
				min = arr[i];
			}
		}
		return max - min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5, 17, 100, 1};
		System.out.println(findDiff(arr));
	}

}
