package com.staticmember;

class demo11 {
	static int i;
	static
	{
		System.out.println("from sib1");
	}

	public static void main(String[] args) {
		System.out.println("from main of demo11");
		System.out.println(demo12.j);
		

	}

}
