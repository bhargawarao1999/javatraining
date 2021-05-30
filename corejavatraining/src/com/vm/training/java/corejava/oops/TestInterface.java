package com.vm.training.java.corejava.oops;

public class TestInterface {
	public static void main(String[] args) 
	{
		/*IVehicle vehicle = new Bus();
		vehicle.steering();
		vehicle.breaks();
		vehicle.clutches();*/

		Car car = new TATA("Indica");//Here we can change TATA to BMW for execution
		//Below are the methods we are calling
		car.ac();//Air Conditioner
		car.accelerator();
		car.breaks();
		car.clutches();
		car.gear();
		car.indicators();
		car.steering();
	}

}
