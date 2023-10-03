package com.array.assignment;

import com.array.PrefixSum;

public class EquilibriumIndex {

	static PrefixSum prefixSum = new PrefixSum();

	public static int findIndex(int[] arr) {

		int leftSum = 0, rightSum = 0;
		int min = Integer.MAX_VALUE;
		int[] prefixArray = prefixSum.prefix_Sum(arr);
		
		for(int i=arr.length-1;i>=0;i--) {
			
			if(i==arr.length-1) {
				rightSum=0;
				leftSum=prefixArray[i-1];
			}
			else if(i==0) {
				leftSum=0;
				rightSum = prefixArray[arr.length-1] - prefixArray[i];
			}
			else {
				
				leftSum = prefixArray[i-1];

				rightSum = prefixArray[arr.length-1] - prefixArray[i];
			}

			if(leftSum==rightSum) {

				min = i;

			}
			
		}
		if(min==Integer.MAX_VALUE) {
			return -1;
		}
		else
			return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3};
		System.out.println(findIndex(arr));

	}

}
