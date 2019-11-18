package com.arraylist;

class movie {
	String name;
	double ratings;
	movie(){
		
	}
	@Override
	public String toString() {
		return "[ Movie details: "+name+""+ratings+"]" ;
	}
	public movie(String name, double ratings) {
		super();
		this.name = name;
		this.ratings = ratings;
	}

}
