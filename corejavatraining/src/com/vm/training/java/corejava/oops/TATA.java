package com.vm.training.java.corejava.oops;
//TATA class implementing methods from class Car
public class TATA extends Car {

	TATA(String model) {
		super(model);
		// TODO Auto-generated constructor stub
		System.out.println("Model: "+model);
	}

	@Override
	void ac() {
		// TODO Auto-generated method stub
		System.out.println("Foront ac");
	}

	@Override
	void indicators() {
		// TODO Auto-generated method stub
		System.out.println("Regular Indicator");
	}

}
