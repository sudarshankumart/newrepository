package com.staticmember;

class demo2 {
	static int i;//static member value
	static
	{
		System.out.println("static intializer block1");
	}
	static
	{
		System.out.println("static intializer block2");
	}
	static void test()
	{
		System.out.println("static method");
	}
	

	public static void main(String[] args) 
	{
		
		test();
	}

}
