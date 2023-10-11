package com.array.assignment;

import java.util.*;


public class RepeatMissing {


	public static int[] findNumbers(int[] arr) {

		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		Iterator hmIterator = hmap.entrySet().iterator();
		//HashMap.Entry mapElement = (HashMap.Entry)hmIterator.next();
		int[] arr1 = new int[2];
		int count =0;
		for(int i=1;i<=arr.length;i++){

			hmap.put(i, 0);
		}
		for(int i=0;i<arr.length;i++){

			if(hmap.containsKey(arr[i])) {
				hmap.put(arr[i], hmap.get(arr[i])+1);
			}
		}
		for (Map.Entry mapElement : hmap.entrySet()) {
			if((int)mapElement.getValue()>1) {
				arr1[count] = (int)mapElement.getKey();
				count++;
			}
		}
		for (Map.Entry mapElement : hmap.entrySet()) {
			if((int)mapElement.getValue()==0) {
				arr1[count] = (int)mapElement.getKey();
			}
		}

		return arr1;
	}

	public static void main(String[] args) {
		int[] arr = {3, 1, 2, 5, 3};
		System.out.println(findNumbers(arr));
	}

}
