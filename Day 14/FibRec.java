package com.array.assignment;

public class FibRec {
	
	public static int findAthFibonacci(int x) {
		
		if(x==0) {
			return 0;
		}
		else if(x==1) {
			return 1;
		}
		else {
			return findAthFibonacci(x-1)+findAthFibonacci(x-2);
		}
    }

	public static void main(String[] args) {
		
		System.out.println(findAthFibonacci(9));
	}

}
