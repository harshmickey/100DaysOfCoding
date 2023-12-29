package com.array.assignment;

public class CountOccurrence {
	
	public static int findOccurences(String str) {
		
		char[] arr = str.toCharArray();
		int count =0;
		for(int i=0;i<=arr.length-3;i++) {
			if(arr[i]=='b' && arr[i+1]=='o' && arr[i+2]=='b') {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		
		String str = "bobob";
		System.out.println(findOccurences(str));
	}

}
