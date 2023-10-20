package com.array.assignment;

import java.util.Arrays;
import java.util.Collections;

public class ElementsRemoval {
	
	public static int findCost(int[] arr) {
		Arrays.sort(arr);
        int ans = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++){

            sum = sum + arr[i];
        }
        ans = ans+sum;
        for(int i=arr.length-2;i>=0;i--){

            sum = sum - arr[i+1];
            ans = ans + sum;
        }
        return ans;
		
	}

	public static void main(String[] args) {
		int[] arr = {2, 1};
		System.out.println(findCost(arr));

	}

}
