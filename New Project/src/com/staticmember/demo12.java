package com.staticmember;

class demo12 {
	static boolean j;
	static
	{
		System.out.println("from sib of demo12");
	}
	public static void main(String[] args) {
		System.out.println("from main of demo12");
		System.out.println(demo11.i);
		demo11.i=30;
		System.out.println(demo11.i);
	}

}
