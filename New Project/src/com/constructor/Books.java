package com.constructor;

public class Books {
	String name;
	int price;
	int isbn;
	Books(String name,int price,int isbn)
	{
		this.name=name;
		this.price=price;
		this.isbn=isbn;
	}
	void genre(String genre)
	{
		System.out.println(name+"this book is of genre thriller");
	}

}
