package com.array.assignment;

import java.util.HashMap;

public class DistinctNumWindow {
	
	
	public static int[] countDistinct(int[] arr, int x) {
		
		int i=0;
		int j=0;
		int count=0;
		int[] arr1 = new int[arr.length-x+1];
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		while(j<arr.length) {
			if((j-i+1)!=x) {
				if(map.containsKey(arr[j])) {
					map.put(arr[j],map.get(arr[j])+1);
				}else {
					map.put(arr[j], 1);
				}
				j++;
			}
			else {
				if(map.containsKey(arr[j])) {
					map.put(arr[j],map.get(arr[j])+1);
				}else {
					map.put(arr[j], 1);
				}
				arr1[count]=map.size();
				count++;
				if(map.get(arr[i])>1) {
					map.put(arr[i],map.get(arr[i])-1);
				}else {
					map.remove(arr[i]);
				}
				i++;
				j++;
				
			}
			
		}
		return arr1;
	}

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 1, 3, 4, 3};
		int[] arr1 = countDistinct(arr,3);
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
	}

}
