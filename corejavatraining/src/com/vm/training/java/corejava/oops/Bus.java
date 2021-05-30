package com.vm.training.java.corejava.oops;

public class Bus implements IVehicle {
	@Override
	public void breaks() {
		// TODO Auto-generated method stub
		System.out.println("breaks done");
	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Manual Steering");
	}

	@Override
	public void accelerator() {
		// TODO Auto-generated method stub
		System.out.println("70kmps");
	}

	@Override
	public void clutches() {
		// TODO Auto-generated method stub
		System.out.println("based on gears");
	}

	@Override
	public int gear() {
		// TODO Auto-generated method stub
		return 7;
	}
	

}
