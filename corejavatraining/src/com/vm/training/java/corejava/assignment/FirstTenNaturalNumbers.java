package com.vm.training.java.corejava.assignment;

public class FirstTenNaturalNumbers {

	public static void main(String[] args) {

		int firstNumber=1,nextNumber;//Natural numbers start with 1
		System.out.println("The first 10 natural numbers are:");

		for(nextNumber=firstNumber;nextNumber<=10;nextNumber++)//nextNumber is initialized and incremented
			System.out.println(nextNumber);
	}

}
