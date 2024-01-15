package com.subsequencNsubset.assignment;

public class FindSubsequence {
	
	public String solve(String A, String B) {
        int j=0;
		for(int i=0;i<B.length();i++) {
				if(B.charAt(i)==A.charAt(j)) {
					j++;
				}if(j==A.length()) {
					return "YES";
				}
			}	return "NO";
		
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
