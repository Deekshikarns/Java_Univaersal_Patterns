package com.javabasics.universalpatterns;

import java.util.Scanner;

public class Letter_R {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows : ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0||i==0&&j<(n-1)||i==((n-1)/2)&&j<(n-1)||i>0 &&i<((n-1)/2)&&j==(n-1)||i==j&&i>(n-1)/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
