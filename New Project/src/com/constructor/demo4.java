package com.constructor;

class demo4 {
	demo4(int a)
	{
		System.out.println(a);
	}
	demo4(int a,int b)
	{
		System.out.println(a+b);
	}
	demo4(String name)
	{
		System.out.println(name);
	}

	public static void main(String[] args) {
		demo4 obj1=new demo4(10);
		demo4 obj2=new demo4("sudarshan");
		demo4 obj3=new demo4(10,5);
		
		
		
	}

}
