package com.vm.training.java.corejava.assignment;

public class TestBank {
	public static void main(String[] args) {
		IBank interest = new SBI();//We change SBI to HDFC or ICICI also
		System.out.println(interest.rateOfInterest());
	}
}
