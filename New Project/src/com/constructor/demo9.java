package com.constructor;

 class demo9 {
	 int i;
	 demo9()
	 {
		 i=30;
	 }
	 demo9(int a)
	 {
		 i=a;
	 }

	public static void main(String[] args) {
		demo9 obj1=new demo9();
		System.out.println(obj1.i);
		demo9 obj2=new demo9();
		System.out.println(obj2.i);
		demo9 obj3=new demo9(5);
		System.out.println(obj3.i);
		demo9 obj4=new demo9(10);
		System.out.println(obj4.i);
		

	}

}
