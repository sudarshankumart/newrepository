package com.instanceof1;

public class MainClass {

	public static void main(String[] args) {
		A ob1=new B();
        
		System.out.println(ob1 instanceof B);
		System.out.println(ob1 instanceof A);
		//System.out.println(ob1 instanceof D); it does not have a is a relationship with D
		
		B ob2=new B();
		System.out.println(ob2 instanceof B);
		System.out.println(ob2 instanceof A);
		System.out.println(ob1 instanceof B);
		//System.out.println(ob1 instanceof D); it does not have a is a relationship with D
		
		A ob3=new A();
		System.out.println(ob3 instanceof B);
		System.out.println(ob3 instanceof A);
		System.out.println(ob3 instanceof B);
	
	
	}

}
