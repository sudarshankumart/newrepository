package com.constructor;

class BoxOffice1 
{

	public static void main(String[] args) 
	{
		System.out.println("from boxoffice");
		moviee obj1=new moviee("dearzindagi",2019,7.5);
		moviee obj2=new moviee("uri",2019,9.5);
		moviee obj3=new moviee("nota",2019,2.5);
		System.out.println("Movie Name:- "+obj1.name+" Year of release:- "+obj1.year_of_release+" Movie rating:- "+obj1.rating);
		System.out.println("Movie Name:- "+obj2.name+" Year of release:- "+obj2.year_of_release+" Movie rating:- "+obj2.rating);
		System.out.println("Movie Name:- "+obj3.name+" Year of release:- "+obj3.year_of_release+" Movie rating:- "+obj3.rating);
		

	}

}
