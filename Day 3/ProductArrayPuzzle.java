package com.array.assignment;

public class ProductArrayPuzzle {
	
	public static int findProduct(int[] arr) {
		
		int prod = 1;
		for(int i=0;i<arr.length;i++) {
			
			prod = prod * arr[i];
		}
		return prod;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int prod = findProduct(arr);
		int[] arr1 = new int[arr.length];
		for(int i=0;i<arr1.length;i++) {
			
			arr1[i] = prod/arr[i];
		}
		System.out.println(arr1);
	}

}
