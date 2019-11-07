package com.nonstaticmembers;

public class p1 {
	{
		System.out.println("im krupa");
	}
	p1()
	{
		System.out.println("im sportsgirl");
		System.out.println("im dancer");
	}
	p1(String x)
	{
		
		System.out.println("im also singer");
	}
	p1(int x)
	{
		this("");
		System.out.println("im bonduuu");
	}
	public static void main(String[] args) {
		p1 ob1=new p1();
		System.out.println("*****");
		p1 ob2=new p1("");
		System.out.println("*****");
		p1 ob3=new p1(10);
		
		

	}

}
