package com.miscelinous;
class Car {
	// Methods implementation and class/Instance members
	String color;
	int maxSpeed; 
	public void carInfo(){
		System.out.println("Car Color= "+color + " Max Speed= " + maxSpeed);
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
}

