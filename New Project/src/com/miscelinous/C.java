package com.miscelinous;

public class C {
	int i;
	double d;
	boolean b;

	public static void main(String[] args) {
		C obj1=new C();
		obj1.i=10;
		obj1.d=10.00;
		obj1.b=false;
		System.out.println(obj1.i);
		System.out.println(obj1.d);
		System.out.println(obj1.b);
		System.out.println("******");
		C obj2=new C();
		obj2.i=30;
		obj2.d=15.00;
		obj2.b=true;
		System.out.println(obj2.i);
		System.out.println(obj2.d);
		System.out.println(obj2.b);
		

	}

}
