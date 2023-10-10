package com.array.assignment;

public class BinaryString {
	
	public static int findLength(String str) {
		
		int count=0;
		int ans=0;
		for(int i=0;i<str.length();i++) {
			
			if(str.charAt(i)=='1') {
				
				count++;
			}
		}
		for(int j=0;j<str.length();j++) {
			
			if(str.charAt(j)=='0') {
				
				int left =0;
				for(int k=j-1;k>=0;k--) {
					if(str.charAt(k)=='1') {
						left++;
					}
					else
						break;
				}
				int right =0;
				for(int l=j+1;l<str.length();l++) {
					if(str.charAt(l)=='1') {
						right++;
					}
					else
						break;
				}
				if(count>left+right) {
					ans = Math.max(ans, left+right+1);
				}
				else {
					ans = Math.max(ans, left+right);
				}
			}
			
				
		}
		return ans;
	}

	public static void main(String[] args) {
		String str = "010100110101";
		System.out.println(findLength(str));

	}

}
