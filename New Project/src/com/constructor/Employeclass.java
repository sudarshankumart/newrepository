package com.constructor;

public class Employeclass {

	public static void main(String[] args) {
		System.out.println("Employee Details");
		EmployeDetails obj1=new EmployeDetails( "Krupa",19_051999,55000.00);
		EmployeDetails obj2=new EmployeDetails("Sudarshan kumar T",19051998,1500000.0);
		EmployeDetails obj3=new EmployeDetails("Surya",1234 , 20000.0);
		System.out.println("EmployeName:- "+obj1.Name+" Employeid:- "+obj1.Employeid+" Bloodgroup:- "+obj1.salary);
		System.out.println("EmployeName:- "+obj2.Name+" Employeid:- "+obj2.Employeid+" Bloodgroup:- "+obj2.salary);
		System.out.println("EmployeName:- "+obj3.Name+" Employeid:- "+obj3.Employeid+" Bloodgroup:- "+obj3.salary);
		
		
		

	}

}
