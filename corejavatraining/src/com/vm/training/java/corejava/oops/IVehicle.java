package com.vm.training.java.corejava.oops;

public interface IVehicle implements Son
{
	void breaks();
	void steering();
	void accelerator();
	void clutches();
	int gear();
}
//Interface inside interface does not show error
