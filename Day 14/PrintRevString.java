package com.array.assignment;

import java.util.Scanner;

public class PrintRevString {

	public static void printRev(String str,int e){
		if(e>=0){
			System.out.print(str.charAt(e));
			printRev(str,e-1);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int e = str.length()-1;
		printRev(str,e);
	}

}
