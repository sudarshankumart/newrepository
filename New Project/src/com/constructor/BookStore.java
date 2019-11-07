package com.constructor;

public class BookStore {

	public static void main(String[] args) {
		Books[] Shelf= {new Books("the evil dead",1500,1),new Books("the resident evil",2500,2),new Books("the dictator",1550,3)};
		for(Books ob:Shelf)
		{
			System.out.println("book name is "+ob.name +" book price is:- "+ ob.price +" isbn number is:= "+ ob.isbn);
			
			ob.genre("thriller");
		}
		
	}

}
