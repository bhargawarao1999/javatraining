package com.vm.training.java.corejava.assignment2;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car(1965,"BatMobile");
		for(int i=1;i<=5;i++)
		{
			System.out.println("Speed of car: "+car.accelerator());
		}
		for(int i=1;i<=5;i++)
		{
			System.out.println("After brake Speed of car: "+car.brake());
		}
//		System.out.println(car.accelerator());
//		System.out.println(car.accelerator());
//		System.out.println(car.accelerator());
//		System.out.println(car.accelerator());
//		System.out.println(car.accelerator());
//		System.out.println(car.brake());
//		System.out.println(car.brake());
//		System.out.println(car.brake());
//		System.out.println(car.brake());
//		System.out.println(car.brake());
//		System.out.println(car.brake());
	}
}
