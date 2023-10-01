package com.array.assignment;

import java.util.Scanner;

public class Armstrong {

	public static void findArmstrong(int N) {
		for (int i=1;i<=N;i++)
		{
			int sum=0;
			int temp=i;
			int c=0;
			while(temp>0)
			{
				c= temp%10;
				sum= sum + (c*c*c);
				temp=temp/10;

			}
			if(i==sum)
			{
				System.out.println(sum);
			}

		}
	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			int x = sc.nextInt();
			findArmstrong(x);
		}

	}
