package com.array.assignment;

public class SpecialSubsequence {
	
	public static int findNumberOfSubsequence(String str) {
		
		char[] arr = str.toCharArray();
		int count =0;
		int ans =0;
		for(int i=arr.length-1;i>=0;i--) {
			
			if(arr[i]=='G') {
				
				count++;
				
				
			}
			else if(arr[i]=='A') {
				
				ans = ans + count;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		String str = "GAB";
		System.out.println(findNumberOfSubsequence(str));
	}

}
