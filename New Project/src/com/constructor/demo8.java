package com.constructor;

class demo8 {
	int i=10;
	double d=12.0;
	demo8()
	{
		System.out.println(i);
		System.out.println(d);
		System.out.println(this.i);
		System.out.println(this.d);
	}
	public static void main(String[] args) 
	{
		demo8 obj1 = new demo8();
		System.out.println("from main method");
		System.out.println(obj1.d);
		System.out.println(obj1.i);
	}

}
