package com.javaproject;

public class demo3 {
	public static void meth(double x)
	{
		System.out.println("from meth d");
		System.out.println(x);
	}
	public static void meth(int x)
	{
		System.out.println("from meth integer ");
		System.out.println(x);
	}

	public static void main(String[] args) {
		meth('z');
		meth(10.0);
		meth('a');
		meth(5.0f);
		meth(2);
		
		

	}

}
