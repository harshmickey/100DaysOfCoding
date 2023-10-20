package com.array.assignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RepeatNumber {
	
	public static int findRepeatedNumber(final List<Integer> arr) {
		
		int temp=-1;
		int ele = 0;
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		Iterator hmIterator = hmap.entrySet().iterator();
		for(int i=0;i<arr.size();i++) {
			if(hmap.containsKey(arr.get(i))) {
				hmap.put(arr.get(i), hmap.get(arr.get(i))+1);
			}
			else if(!hmap.containsKey(arr.get(i))) {
				hmap.put(arr.get(i), 1);
			}
		}
		for (Map.Entry mapElement : hmap.entrySet()) {
			if((int)mapElement.getValue()>arr.size()/3) {
				temp=0;
				ele = (int)mapElement.getKey();
			}
			
		}
		if(temp==0) {
			return ele;
		}
		else
			return temp;
	}

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();  
		list.add(1000441);
		list.add(1000441);
		list.add(1000994);
		System.out.println(findRepeatedNumber(list));

	}

}
