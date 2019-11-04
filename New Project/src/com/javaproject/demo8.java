package com.javaproject;

import java.util.Scanner;
public class demo8 {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the starting number");
	int n=sc.nextInt();
	System.out.println("enter the size of even nos to be printed");
	int size=sc.nextInt();
	int[] a=new int[size];
	for(int i=0;i<a.length;n++)
	{
		if(n%2==0)
		{
			a[i]=n;
			i++;
		}
	}
	System.out.println("array is :");
	for(int i=0;i<a.length;i++)
		System.out.println(a[i]);

			

	}

}
