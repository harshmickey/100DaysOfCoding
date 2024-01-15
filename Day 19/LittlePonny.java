package com.tree.assignment;

public class LittlePonny {


	public static String findMinimumLexSubseq(String str) {

		String main="";
		char a = str.charAt(0);
		char b = str.charAt(1);
		for(int i=2;i<str.length();i++) {
			if(b<a) {
				a=b;
				b=str.charAt(i);

			}
			else if(str.charAt(i)<b){
				b=str.charAt(i);
			}


		} main=Character.toString(a)+Character.toString(b);
		return main;
	}
	public static void main(String[] args) {



	}

}
