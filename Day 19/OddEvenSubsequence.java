package com.subsequencNsubset.assignment;

public class OddEvenSubsequence {
	
	
	public static int solve(int[] A) {
        int cnt=1;
        for(int i=1;i<A.length;i++){
            if((A[i-1] & 1)!= (A[i] & 1)){
                cnt++;
            }
        }return cnt;
        
    }

	public static void main(String[] args) {
		
		int[] arr = {10,10,10,10,9,9,9,9,8,8,8,8,7,7,7,7};
		System.out.println(solve(arr));
	}

}
