package com.array.assignment;

public class PowerFunction {
	
	public static int findPow(int x, int y, int z) {
		
		int halfpow = 0;
		int halfans = 0;
		if(x==0 && y==0) {
			
			return 0;
		}
		
		else if(y==0) {
			return 1;
		}
		
		else if(y==1) {
			return (x%z)+z;
		}
		
		else {
			
			halfpow = findPow(x,y/2,z);
			halfans = ((((halfpow%z)) * ((halfpow%z)))%z)+z;
			
			if(y%2==0) {
				
				return halfans;
			}
			
			return x*halfans;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(findPow(213,231,1));

	}

}
