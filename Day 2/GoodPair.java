package com.array.assignment;

public class GoodPair {
	
	public static int findGoodPair(int[] arr, int x) {
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length;j++) {
				
				if(arr[i]+arr[j]==x) {
					return 1;
				}
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,8};
		int x = 7;
		System.out.println(findGoodPair(arr,x));
		
	}

}
