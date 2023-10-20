package com.array.assignment;

public class MajorityElement {

	public int majorityElement(final int[] A) {

		int majele=A[0];
		int count =1;
		for(int i=1;i<A.length;i++) {
			if(count==0) {
				majele=A[i];
				count++;

			}else if(A[i]==majele){
				count++;


			}else{
				count--;
			}

		}
		return majele;


	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
