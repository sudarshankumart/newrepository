package com.miscelinous;

public class Employee {
	int Id;
	String Name;
	double Salary;
	Employee(int Id,String Name,double Salary)
	{
		this.Id=Id;
		this.Name=Name;
		this.Salary=Salary;
	}
	 static Employee createemployee(int Id,String Name,double Salary)
	{
		return new Employee(Id, Name, Salary);     /* Employee emp =new Employee(Id, Name, Salary);
		                                              return emp;*/
		                                                   
	}
	 Employee intializing(double Salary)
	 {
		/*this.Id=Id;
		this.Name=Name;*/
		this.Salary=Salary;
		return this;
	 }
	 Employee displaying()
	 {
		 System.out.println(this.Id);
		 System.out.println(this.Name);
		 System.out.println(this.Salary);
		 return this;
	 }
	 public static void main(String[] args) 
	 {
		 //created employee and displayed its detail
		 Employee emp1=Employee.createemployee(12,"karthik",23500000000.0).displaying();
		 //create display hike salary display
		 emp1.intializing(20.00).displaying();
		
	}
	 
	 
	

}
