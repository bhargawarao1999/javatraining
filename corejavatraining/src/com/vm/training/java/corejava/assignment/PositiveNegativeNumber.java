package com.vm.training.java.corejava.assignment;


public class PositiveNegativeNumber { 
	
	public static void main(String[] args) {
		
				int number;
				number=Integer.parseInt(args[0]);//Converting String to Integer
				if(number<0)//Checking number less than 0
					System.out.println("Number is negative");
				else if (number>0)//Checking number greater than 0
					System.out.println("Number is positive");
				else 
					System.out.println("The given is ZERO ");
	}
	
}
