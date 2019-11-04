package com.staticmember;

public class Mc {

	public static void main(String[] args) {
		C obj1=new C();
		E obj2=new E();
		obj1.d=15;
        obj2.d=25;
		System.out.println(obj1.d);
		System.out.println(obj2.d);


	}

}
