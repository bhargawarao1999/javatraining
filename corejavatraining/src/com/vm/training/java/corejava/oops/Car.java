/**
 * 
 */
package com.vm.training.java.corejava.oops;

/**
 * @author Bhargawa
 *
 */
public abstract class Car implements IVehicle 
{
	String model;//Stores name of the model
	Car(String model)
	{
		this.model=model;
	}
	@Override
	public void breaks() {
		// TODO Auto-generated method stub
		System.out.println("Disc breaks");
	}

	@Override
	public void steering() {
		// TODO Auto-generated method stub
		System.out.println("Manual");
	}

	@Override
	public void accelerator() {
		// TODO Auto-generated method stub
		System.out.println("100kmps");
	}

	@Override
	public void clutches() {
		// TODO Auto-generated method stub
		System.out.println("based on gear");
	}

	@Override
	public int gear() {
		// TODO Auto-generated method stub
		return 5;
	}
	abstract void ac();
	abstract void indicators();
}
	