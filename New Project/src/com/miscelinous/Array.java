package com.miscelinous;

public class Array {
	static void display(int[] a)
	{
		for(int i=0;i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
	}
	static void swapArray(int[] a,int p1,int p2)
	{
		int temp =a[p1];
		a[p1]=a[p2];
		a[p2]=temp;
	}
	public static void main(String[] args) {
		int[] a= {10,20,30,40};
		Array.display(a);
		swapArray(a,1,2);
		System.out.println("after swapping");
		
		Array.display(a);
		
	}

}
