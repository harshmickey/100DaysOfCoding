package com.array.assignment;

public class LongestPalindromicSubString {
	
	
	public static String findLongestPalSubStr(String str) {
		
		char[] arr = str.toCharArray();
		String str1 = "";
		for(int x=0;x<arr.length;x++) {
			
			int i=x,j=x;
			while(i>=0 && j<arr.length && arr[i]==arr[j]) {
				i--;
				j++;
			}
			if((j-i-1)>str1.length()) {
				str1 = str.substring(i+1, j);
			}
			
			i=x;
			j=x+1;
			if(x<arr.length-1 && arr[i]==arr[j]) {
				
				while(i>=0 && j<arr.length && arr[i]==arr[j]) {
					i--;
					j++;
				}
				if((j-i-1)>str1.length()) {
					str1 = str.substring(i+1, j);
				}
			}
			
		}
		return str1;
	}

	public static void main(String[] args) {
		
		String str = "aaaabaaa";
		System.out.println(findLongestPalSubStr(str));
	}

}
