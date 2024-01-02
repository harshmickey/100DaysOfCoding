package com.array.assignment;

import java.util.HashMap;

public class ColourfulNumber {
	
	
	public static int isColourful(int x) {
		
		HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
		char[] arr = String.valueOf(x).toCharArray();
		for(int i=0;i<arr.length;i++) {
			int prod=1;
			for(int j=i;j<arr.length;j++) {
				prod = prod*(arr[j]-'0');
				if(map.containsKey(prod)) {
					return 0;
				}
				else {
					map.put(prod, 1);
				}
			}
			
		}
		return 1;
	}

	public static void main(String[] args) {
		
		System.out.println(isColourful(236));
	}

}
