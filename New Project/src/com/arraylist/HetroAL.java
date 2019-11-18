package com.arraylist;

import java.util.ArrayList;

public class HetroAL 
{

	public static void main(String[] args) 
	{
		ArrayList hetro = new ArrayList();
		hetro.add(new Bike("Red",60));
		hetro.add(new emp(20,"vishnu"));
		hetro.add(new movie("KGF",10.0));
		hetro.add(10);
		System.out.println(hetro);
		for(int i=0;i<hetro.size();i++)
		{
			Object x =hetro.get(i);
			if(x instanceof Bike)
			{
				System.out.println(((Bike)x).color);
				System.out.println(((Bike)x).mileage);
			}
			if(x instanceof emp)
			{
				System.out.println(((emp)x).id);
				System.out.println(((emp)x).name);
			}
			if(x instanceof movie)
			{
				System.out.println(((movie)x).name);
				System.out.println(((movie)x).ratings);
			}
			if(x instanceof Integer)
			{
				System.out.println(((Integer)x)+12);
		    }
		
		}
	}

}
