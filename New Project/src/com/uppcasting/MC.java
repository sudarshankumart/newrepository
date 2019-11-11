package com.uppcasting;

class MC {

	public static void main(String[] args) {
		A ob1=new B();//upcasting
		System.out.println(ob1.i);
		//System.out.println(ob1.j); cte using parent ref var u cannot access members of child class

		
		B ob2 = new B();
		System.out.println(ob2.i);
		System.out.println(ob2.j);
		
		A ob3=ob2;//upcasting
		System.out.println(ob3.i);
		//System.out.println(ob3.j);

		
	}

}
