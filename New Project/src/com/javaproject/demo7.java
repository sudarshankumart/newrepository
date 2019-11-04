package com.javaproject;

public class demo7 {

	public static void main(String[] args) {
		int n=157;
		int size=5;
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
