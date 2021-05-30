package com.vm.training.java.corejava.oops;
//BMW class implementing methods from class Car
public class BMW extends Car {

	BMW(String model) {
		super(model);
		// Printing model number
		System.out.println("Model: "+model);
	}

	@Override
	void ac() {//implimenting ac method (Air Conditioner)
		// TODO Auto-generated method stub
		System.out.println("Split AC");
	}

	@Override
	void indicators() {//implimenting indicator method
		// TODO Auto-generated method stub
		System.out.println("Regular indicator and indicators at mirrors");
	}

}
