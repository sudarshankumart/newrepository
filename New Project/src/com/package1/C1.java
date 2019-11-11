package com.package1;

class C1 extends A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(C1.i);//i is private hence not inherited
		C1 ob = new C1();
		System.out.println(ob.j);//private members are not in herited in sub class object

	}

}
