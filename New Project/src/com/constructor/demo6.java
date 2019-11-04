package com.constructor;

class demo6 {
	int i;
	demo6()
	{
		System.out.println(this);
	}

	public static void main(String[] args) {
		demo6 obj1=new demo6();
		System.out.println(obj1);
		System.out.println("***");
		demo6 obj2=new demo6();
		System.out.println(obj2);
		
		

	}

}
