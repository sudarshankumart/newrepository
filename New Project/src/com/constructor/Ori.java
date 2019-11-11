package com.constructor;
import java.util.Scanner;


public class Ori {
	static void display(int n)
	{
		 for(int i=0;i<=n;i++)
		    {
		    	System.out.println(i);
		    }
					
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the nth element");
	    int n=sc.nextInt();
	    display(n);
	   
	

	}

}
