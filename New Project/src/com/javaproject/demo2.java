package com.javaproject;

public class demo2 {
	public static void sum(int a,int b)
	{
		System.out.println(a+b);
	}
	public static void sum(int a,int b,int c)
	{
		System.out.println(a+b);
	}
	public static void sum(double a,double b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		sum(2,3);
		sum(23,1,5);
		sum(5.0,1);
		

	}

}
