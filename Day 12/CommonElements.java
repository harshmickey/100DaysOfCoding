package com.array.assignment;

import java.util.ArrayList;
import java.util.HashMap;

public class CommonElements {

	public static ArrayList<Integer> findAllCommon(ArrayList<Integer> A, ArrayList<Integer> B) {

		HashMap<Integer,Integer> map1=new HashMap<Integer,Integer>();
		HashMap<Integer,Integer> map2=new HashMap<Integer,Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		for(int i=0;i<A.size();i++) {
			if(map1.containsKey(A.get(i))) {
				map1.put(A.get(i), map1.get(A.get(i))+1);
			}else {
				map1.put(A.get(i), 1);
			}
		}
		for(int j=0;j<B.size();j++) {
			if(map2.containsKey(B.get(j))) {
				map2.put(B.get(j), map2.get(B.get(j))+1);
			}else {
				map2.put(B.get(j), 1);
			}
		}
		for (HashMap.Entry<Integer,Integer> entry : map1.entrySet()) {
			int count=0;
			if(map2.containsKey(entry.getKey())) {
				count = Math.min(entry.getValue(),map2.get(entry.getKey()));

			}
			for(int x=0;x<count;x++){
				C.add(entry.getKey());
			}
		}
		return C;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
