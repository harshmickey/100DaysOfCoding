package com.array.assignment;

public class XORPairs {
	
	public static int findPair(int[] arr, int x) {
		
		int i=0,j=i+1;
		int count=0;
		while(i<arr.length-1) {
			
			if(j==arr.length-1) {
				if((arr[i] ^ arr[j]) == x) {
					count++;
				}
				i++;
				j=i+1;
			}
			else if((arr[i] ^ arr[j]) == x) {
				count++;
				j++;
			}
			else
				j++;
		}
		return count;
	}


	public static void main(String[] args) {
		
		int[] arr = {17, 18, 8, 13, 15, 7, 11, 5, 4, 9, 12, 6, 10, 14, 16, 3};
		System.out.println(findPair(arr,9));
	}

}
