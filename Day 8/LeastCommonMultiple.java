package com.array.assignment;

public class LeastCommonMultiple {
	
	public int findLCM(int A, int B) {
        int hcf=1;
        if(B>=A){
            for(int i=1;i<=A;i++)
            {
                if(A%i==0 && B%i==0){
                    hcf=i;
                }
                
             }
        }else {
               for(int i=1;i<=B;i++)
            {
                if(A%i==0 && B%i==0){
                    hcf=i;
                }
                
             } 
        }
        return ((A*B)/hcf);
        
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
