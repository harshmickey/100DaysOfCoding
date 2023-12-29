package com.array.assignment;

public class ReverseWord {
	
	
	public static String reverseString(String str, int s, int e) {
		
		char[] arr = str.toCharArray();
		while(s<e) {
			char ch = arr[s];
			arr[s]=arr[e];
			arr[e]=ch;
			s++;
			e--;
		}
		String atr1 = String.valueOf(arr);
		return atr1;
	}

	public static void main(String[] args) {
		String str = "the sky is blue";
		str = reverseString(str,0,str.length()-1);
		int start =0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				str = reverseString(str,start,i-1);
				start = i+1;
			}
			else if(i==str.length()-1) {
				str = reverseString(str,start,str.length()-1);
			}
		}
		System.out.println(str);
	}

}
