package com.array.assignment;

import java.util.ArrayList;

public class KthSymbol {
	
	public static int findIndexedEle(int x, int y) {
		
		ArrayList<String> elements = new ArrayList<String>();
		elements.add(0, "0");
		elements.add(1, "01");
		
		StringBuilder sb = new StringBuilder();
		for(int i=2;i<x;i++) {
			
			for(int j=0;j<elements.get(i-1).length();j++) {
				if(elements.get(i-1).charAt(j)=='0') {
					sb.append("01");
				}
				else if(elements.get(i-1).charAt(j)=='1') {
					sb.append("10");
				}
			}
			elements.add(i, sb.toString());
			sb.delete(0, sb.length());
		}
		
		return Character.getNumericValue(elements.get(x-1).charAt(y-1));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findIndexedEle(5,5));
	}

}
