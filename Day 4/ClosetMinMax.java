package com.array.assignment;

public class ClosetMinMax {

	public static int findMin(int[] arr) {

		int min = Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {

			min = Math.min(min, arr[i]);
		}
		//System.out.println("min:" + min);
		return min;
	}
	public static int findMax(int[] arr) {

		int max = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {

			max = Math.max(max, arr[i]);
		}
		//System.out.println("max:" + max);
		return max;
	}
	public static int findSmallestSubArray(int[] arr) {
		int max = findMax(arr);
		int min = findMin(arr);
		if(max==min) {
			return 1;
		}
		int max_i = -1;
		int min_i = -1;
		int ans = arr.length;
		int len =0;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==max) {
				max_i = i;
				if(min_i!=-1) {

					len = min_i - max_i + 1;
					ans = Math.min(ans, len);
				}

			}
			else if(arr[i]==min) {
				min_i = i;
				if(max_i!=-1) {
					len = max_i - min_i + 1;
					ans = Math.min(ans, len);

				}

			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr = {4, 4, 4, 4, 4};
		System.out.println(findSmallestSubArray(arr));

	}

}
