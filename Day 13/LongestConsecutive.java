package com.array.assignment;

import java.util.Arrays;
import java.util.HashMap;

public class LongestConsecutive {
	
	
	public static int findLongestConsecutiveSeq(final int[] arr) {
		
		Arrays.sort(arr);
		int count =1;
		int mx=1;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i+1]-arr[i]==1) {
				
				count++;
				mx = Math.max(mx, count);
			}
			else if(arr[i+1]-arr[i]>1) {
				mx = Math.max(mx, count);
				count=1;
			}

		}
		return mx;
	}

	public static void main(String[] args) {
		int[] arr = {97, 86, 67, 19, 107, 9, 8, 49, 23, 46, -4, 22, 72, 4, 57, 111, 20, 52, 99, 2, 113, 81, 7, 5, 21, 0, 47, 54, 76, 117, -2, 102, 34, 12, 103, 69, 36, 51, 105, -3, 33, 91, 37, 11, 48, 106, 109, 45, 58, 77, 104, 60, 75, 90, 3, 62, 16, 119, 85, 63, 87, 43, 74, 13, 95, 94, 56, 28, 55, 66, 92, 79, 27, 42, 70};
		System.out.println(findLongestConsecutiveSeq(arr));

	}

}
