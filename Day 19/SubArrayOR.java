package com.tree.assignment;

public class SubArrayOR {
	
	
	public static int findSum(int[] arr) {
		
		long sum=0;
		int j=0;
        
		for(int i=0;i<arr.length;i++) {
			
			j=i;
			int or = arr[i];
			while(j<arr.length) {
				
				or = or | arr[j];
				sum = sum + or;
				j++;
			}
		}
		return (int)(sum % 1000000007);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 8, 9, 10};
		System.out.println(findSum(arr));
	}

}
