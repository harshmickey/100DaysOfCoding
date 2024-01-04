package com.array.assignment;

public class FacRec {
	
	public static int findFac(int x) {
		
		if(x==0) {
			return 1;
		}
		else {
			return findFac(x-1)*x;
		}
		
	}

	public static void main(String[] args) {
		
		System.out.println(findFac(5));
	}

}
