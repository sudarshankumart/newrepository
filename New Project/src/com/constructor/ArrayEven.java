
package com.constructor;
import java.util.Scanner;

public class ArrayEven {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int Size=sc.nextInt();
		int[] ar=new int [Size];
		for(int i=0;i<ar.length;i++)
		{
		System.out.println("enter the even elements"+i);
		ar[i]=sc.nextInt();
		}
		for(int x:ar)
		{
			System.out.println(x+1);
		}
		

	}

}
