package com.javaproject;

public class product {
	public static void pro(int a,int b)
	{
		System.out.println(a*b);
	}
	public static void pro(int c,int b,int a)
	{
		System.out.println(a*b);
	}
	public static void pro(double x,double y)
	{
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		pro(5,5);
		pro(5,10,20);
		pro(1.0,2.1);
		
		

	}

}
