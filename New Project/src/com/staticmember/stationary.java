package com.staticmember;

class stationary {

	public static void main(String[] args) {
		Marker.price=100;
		Marker.colour="blue";
		System.out.println("Marker price is "+Marker.price);
		System.out.println("Marker colour is "+Marker.colour);
		Marker.price=1000;
		Marker.colour="red";
		System.out.println("Marker price is "+Marker.price);
		System.out.println("Marker colour is "+Marker.colour);
		Marker.m1();
		
		

	}

}
