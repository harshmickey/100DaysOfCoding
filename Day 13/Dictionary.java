package com.array.assignment;

import java.util.HashMap;

public class Dictionary {


	public static int isDictionary(String[] arr, String str) {

		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		int count=1;
		for(int i=0;i<str.length();i++) {

			map.put(str.charAt(i), count);
			count++;
		}
		for(int j=0;j<arr.length-1;j++) {
			if(map.get(arr[j].charAt(0))>map.get(arr[j+1].charAt(0))) {
				return 0;
			}
		}
		return 1;
	}

	public static void main(String[] args) {

		String[] arr = {"fine", "none", "no"};
		String str = "qwertyuiopasdfghjklzxcvbnm";
		System.out.println(isDictionary(arr,str));
	}

}
