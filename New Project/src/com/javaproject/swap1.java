package com.javaproject;

public class swap1 {

	public static void main(String[] args) {
		  
			  System.out.println("Before swapping");  
			  int x = 50;  
			  int y = 20;  
			  System.out.println("value of x:" + x);  
			  System.out.println("value of y:" + y);  
			  System.out.println("After swapping");  
			  x = x + y;  
			  y = x - y;  
			  x = x - y;  
			  System.out.println("value of x:" + x);  
			  System.out.println("value of y:" + y);  
			 }  /*x=50+20=70;
	              y=70-20=50
	              x=70-50=20*/
         
	}


