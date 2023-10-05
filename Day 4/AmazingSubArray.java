package com.array.assignment;

public class AmazingSubArray {
	
	public static int findNumberOfSubStrings(String str) {
		
		char[] arr = str.toCharArray();
		int n = arr.length-1;
		int count =0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' ||
					arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
				
				count = count + (n-i+1);
			}

				
		}
		return count % 10003;
	}

	public static void main(String[] args) {
		
		String str = "ABEC";
		System.out.println(findNumberOfSubStrings(str));
	}

}
