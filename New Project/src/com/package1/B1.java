package com.package1;

class B1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(A1.i);//i is private not visible beyond same class
		A1 ob = new A1();
		System.out.println(ob.j);//j is private not visible beyond same class

	}

}
