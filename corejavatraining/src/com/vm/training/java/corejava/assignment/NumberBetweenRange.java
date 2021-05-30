package com.vm.training.java.corejava.assignment;

public class NumberBetweenRange {

	public static void main(String[] args) {
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int increment=num1;//Initializing increment
		do
		{
			System.out.print(increment+" ");
			increment++;
		}while(increment<=num2);

	}

}
