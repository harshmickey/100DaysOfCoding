package com.array.assignment;

import java.util.HashMap;

public class LargestContinousSequence {

	public static int[] largestZeroSum(int[] A) {
		int pf[] = new int[A.length];
		pf[0]=A[0];
		for(int i=1;i<pf.length;i++) {

			pf[i] = A[i]+pf[i-1];
		}
         HashMap < Integer, Integer > map = new HashMap < Integer, Integer > ();
        int result = -1;
        int x=0;
        int y=0;
        int flag=0;
        for (int j= 0; j < pf.length; j++) {
        	
        	if(pf[j]==0) {
        		result = j+1;
        		x=0;
        		y=j;
        		flag=1;
        	}
        	else if (map.containsKey(pf[j])) {
                if((j-map.get(pf[j]))>result){
                        result=j-map.get(pf[j]);
                        x=map.get(pf[j])+1;
                        y=j;
                        flag=1;
                }
                else if((j-map.get(pf[j]))==result){
                    if((map.get(pf[j])+1)<x){
                        x=map.get(pf[j])+1;
                        y=j;
                        flag=1;
                    }
                }
            }
        	else{
                      map.put(pf[j], j);
            }
          
        }
        
        int[] arr=new int [y-x+1];
        if(flag==0) {
        	return new int[0];
        }
        else {
        	for(int k=0;k<arr.length;k++){
                arr[k]=A[x];
                x++;
            }return arr;
        }

         
	}

	public static void main(String[] args) {
		
		int[] arr = {-19, 8, 2, -8, 19, 5, -2, -23};
		int[] arr1 = largestZeroSum(arr);
		for(int i=0;i<arr1.length;i++) {
			
			System.out.println(arr1[i]);
		}

	}

}
