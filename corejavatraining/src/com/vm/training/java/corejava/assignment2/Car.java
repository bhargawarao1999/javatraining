package com.vm.training.java.corejava.assignment2;

public class Car {
	int yearModel;
	String make;
	int speed;
	public Car(int yearModel, String make) {
		super();
		this.yearModel = yearModel;
		this.make = make;
		this.speed = 0;
	}
	public int getYearModel() {
		return yearModel;
	}
	public String getMake() {
		return make;
	}
	public int getSpeed() {
		return speed;
	}
	int accelerator()
	{
		
		return speed+=5;
	}
	int brake()
	{
		if(speed>=5)
			return speed-=5;
		else 
			return 0;
	}
}
