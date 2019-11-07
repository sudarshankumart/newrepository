package com.miscelinous;

public class A {
	int i;
	double d;
	boolean b;
	 static A objectcreation()
	{
		return new A();
	}
	A intitialization(int i,double d,boolean b) 
	{
		this.i=i;
		this.d=d;
		this.b=b;
		return this;
	}
	A display()
	{
		System.out.println(this.i);
		System.out.println(this.d);
		System.out.println(this.b);
		return this;
	}
	

}
