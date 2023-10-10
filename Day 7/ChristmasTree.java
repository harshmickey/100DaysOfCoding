package com.array.assignment;

public class ChristmasTree {
	
	public static int minimumCost(int[] arr1, int[] arr) {
		
		int sum=0;
		int ans = Integer.MAX_VALUE;
		for(int i=1;i<arr1.length;i++) {
			
			for(int j=i-1;j>=0;j--) {
				
				if(arr1[j]<arr1[i]) {
					for(int k=i+1;k<arr1.length;k++) {
						
						if(arr1[k]>arr1[i]) {
							sum = sum + arr[i] + arr[j] + arr[k];
							ans = Math.min(ans, sum);
							sum=0;
						}
						
					}
				}
				
			}
		}
		if(ans == Integer.MAX_VALUE) {
			return -1;
		}
		else
			return ans;
	}

	public static void main(String[] args) {
		
		int[] arr1 = {100, 101, 100};
		int[] arr = { 2, 4, 5};
		System.out.println(minimumCost(arr1,arr));
		
	}

}
