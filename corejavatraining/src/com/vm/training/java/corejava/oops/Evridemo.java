package com.vm.training.java.corejava.oops;
interface Bank
{
	 default void rateOfInterest()
	{
		System.out.println("2%");
	}
	static void loan()
	{
		System.out.println("You can apply loan any Bank");
	}
	int holidays();
}
class Axis implements Bank
{
	public void rateOfInterest()
	{
		System.out.println("4%");
	}
	//Static method cannot be overridden.   
	//A new method is created in chil class
	static void loan()
	{
		System.out.println("You can apply loan Axis Bank");
	}
	@Override
	public int holidays() {
		System.out.println("Saturday and Sunday");
		return 0;
	}
}

public class Evridemo {
	public static void main(String[] args) {
		Bank bank = new Axis();
		bank.rateOfInterest();
		Bank.loan();
	}
}
