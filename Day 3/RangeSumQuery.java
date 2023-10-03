package com.array.assignment;

import java.util.ArrayList;

public class RangeSumQuery {


	/*
	 * public static int prefixRangeSum(int start, int end, int[] arr) {
	 * 
	 * int prefixArray[] = new int[arr.length]; prefixArray[0]=arr[0]; for(int
	 * i=1;i<prefixArray.length;i++) {
	 * 
	 * prefixArray[i] = arr[i]+prefixArray[i-1]; }
	 * 
	 * int sum =0; if(start==0) {
	 * 
	 * return prefixArray[end]; } else {
	 * 
	 * return prefixArray[end]-prefixArray[start-1]; } }
	 */

	public static long[] rangeSum(int[] arr, int[][] arr1) {
		
		long prefixArray[] = new long[arr.length];
		prefixArray[0]=arr[0];
		for(int i=1;i<prefixArray.length;i++) {

			prefixArray[i] = arr[i]+prefixArray[i-1];
		}

		long[] arr2 = new long[arr1.length];
		int x=0;

			
			for(int i=0;i<arr1.length && x<arr1.length;i++) {

				int start = arr1[i][0]-1;
				int end = arr1[i][1]-1;
				long sum = 0;
				if(start==0) {

					sum = prefixArray[end];
				}
				else {

					sum = prefixArray[end]-prefixArray[start-1];
				}
				arr2[x]=sum;
				x++;
			}


		return arr2;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {7, 3, 1, 5, 5, 5, 1, 2, 4, 5 };
		int[][] arr1 = {{7, 10}, {3, 10}, {3, 5}, {1, 10}};
		System.out.println(rangeSum(arr, arr1));
	}

}
