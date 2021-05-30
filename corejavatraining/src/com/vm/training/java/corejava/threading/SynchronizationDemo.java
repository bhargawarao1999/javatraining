package com.vm.training.java.corejava.threading;
class Bottle
{
	synchronized public void drink(int time)
	{
		for(int i=1;i<=time;i++)
			System.out.println(Thread.currentThread().getName());
	}
}
class DrinkWater implements Runnable
{
	Bottle bottle = new Bottle();
	
	@Override
	public void run() {
		bottle.drink(6);
	}
	
}
public class SynchronizationDemo 
{
	public static void main(String[] args) {
		DrinkWater drinkwater= new DrinkWater();
		Thread mani = new Thread(drinkwater);
		Thread sasi = new Thread(drinkwater);
		mani.setName("ManiTeja");
		sasi.setName("Sasi");
		mani.start();
		sasi.start();
	}
}
