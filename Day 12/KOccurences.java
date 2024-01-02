package com.array.assignment;

import java.util.HashMap;

public class KOccurences {

	public int getSum(int A, int B, int[] C) {
		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		int sum =0;
		int ans=-1;
		for(int i=0;i<C.length;i++) {
			if(map1.containsKey(C[i])) {
				map1.put(C[i], map1.get(C[i])+1);
			}else {
				map1.put(C[i], 1);
			}
		}
		for (HashMap.Entry<Integer,Integer> entry : map1.entrySet()) {
			if(entry.getValue()==B) {
				ans=0;
				sum+=entry.getKey();

			}
		}
		if(ans!=0)
			return -1;
		else 
			return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
