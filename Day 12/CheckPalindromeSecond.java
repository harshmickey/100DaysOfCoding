package com.array.assignment;

import java.util.HashMap;

public class CheckPalindromeSecond {

	public static int checkPalindrome(String A) {

		char[] arr=A.toCharArray();
		HashMap<Character,Integer> map1=new HashMap<Character,Integer>();
		int ans =1;
		for(int i=0;i<arr.length;i++) {
			if(map1.containsKey(arr[i])) {
				map1.put(arr[i], map1.get(arr[i])+1);
			}else {
				map1.put(arr[i], 1);
			}
		}
		
		if((arr.length)%2==0) {

			for (HashMap.Entry<Character,Integer> entry : map1.entrySet()) {
				if(entry.getValue()%2!=0) {
					return 0;
				}
			}
		}
		else if((arr.length)%2==1) {
			int count=0;
			for (HashMap.Entry<Character,Integer> entry : map1.entrySet()) {

				if(entry.getValue()%2!=0) {
					count++;
				}if(count>1)
					return 0;
			}
		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
