package com.array.assignment;

public class CheckPalindromeRecc {
	
	public static int ifPalindrome(String str, int s, int e) {
		
		if(s>e) {
			return 1;
		}
		if(str.charAt(s)==str.charAt(e)) {
			return ifPalindrome(str,s+1,e-1);
		}
		return 0;
	}

	public static void main(String[] args) {
		
		String str = "naman";
		int s=0;
		int e=str.length()-1;
		System.out.println(ifPalindrome(str,s,e));
	}

}
