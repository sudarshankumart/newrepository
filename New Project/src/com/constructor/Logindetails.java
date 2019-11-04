package com.constructor;

public class Logindetails {

	public static void main(String[] args) 
	{
		Login obj1=new Login("sudarshan","sudarshan@123",12.0);
		Login obj2=new Login("karthik","karthikspiders@123",33.0);
		Login obj3=new Login("divya","divyas@123",33.0);
		System.out.println("enter the name:= "+obj1.name+", enter the password:= "+obj1.pwd+", roi:= "+obj1.roi);
		System.out.println("enter the name:= "+obj2.name+", enter the password:= "+obj2.pwd+", roi:= "+obj2.roi);
		System.out.println("enter the name:= "+obj3.name+", enter the password:= "+obj3.pwd+", roi:= "+obj3.roi);
		
		

	}

}
