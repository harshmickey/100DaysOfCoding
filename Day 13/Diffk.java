package com.array.assignment;

import java.util.HashMap;

public class Diffk {


	public static int findDiff(int[] arr, int x) {

		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		int flag=0;
		for(int i=0;i<arr.length;i++) {

			if(map1.containsKey(arr[i])) {
				map1.put(arr[i],map1.get(arr[i])+1);
			}else {
				map1.put(arr[i], 1);
			}
		}
		for(int i=0;i<arr.length;i++) {

			if(arr[i]==arr[i]-x) {
				if(map1.containsKey(arr[i]) && map1.get(arr[i])>1)
					flag =1;
			}
			else {
				if(map1.containsKey(arr[i]) && map1.containsKey(arr[i]-x)) {
					flag=1;
				}
			}
			
		}
		return flag;

	}

	public static void main(String[] args) {

		int[] arr = {34, 63, 64, 38, 65, 83, 50, 44, 18, 34, 71, 80, 22, 28, 20, 96, 33, 70, 0, 25, 64, 96, 18, 2, 53, 100, 24, 47, 98, 69, 60, 55, 8, 38, 72, 94, 18, 68, 0, 53, 18, 30, 86, 55, 13, 93, 15, 43, 73, 68, 29};
		System.out.println(findDiff(arr,97));
	}

}
