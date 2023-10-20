package com.array.assignment;

import java.util.Arrays;

public class NobleInteger {
	
	
	public static int checkNoble(int[] arr) {
		
		Arrays.sort(arr);
		int less=1;
		int ele=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(i+1<arr.length&&arr[i]==arr[i+1])
			    continue;
			 int rightmax=arr.length-i-1;
			 if(arr[i]==rightmax)
			    return 1;
            
		}
		return -1;
    
	}

	public static void main(String[] args) {
		 
		int[] arr = { -4, -2, 0, -1, -6 }; /* {-6, -4, -2, -1, 0} */
		System.out.println(checkNoble(arr));
	}

}
