package com.constructor;

class SongList {

	public static void main(String[] args) {
		Song1[] playlist=new Song1[5];
		playlist[0]=new Song1("tere bina","divya",1);
		playlist[1]=new Song1("tum hi ho","arijit",2);
		playlist[2]=new Song1("tu har lamha","arijit",3);
		playlist[3]=new Song1("kal ho na ho","sonu",4);
		playlist[4]=new Song1("tu jo ko jo paya","karthik",5);
		for(Song1 ob :playlist)
		{
			System.out.println("name:"+ob.name);
			System.out.println("singer:"+ob.singer);
			System.out.println("like:"+ob.like);
		}
		

	}

}
