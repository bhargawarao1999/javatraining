package com.vm.training.java.corejava.assignment;

public class CubeOfNumbers 
{
	public static void main(String[] args) 
	{
		int number=Integer.parseInt(args[0]);
		int startingNumber=1,nextNumber,cubeOfNumber;
		for(nextNumber=startingNumber;nextNumber<=number;nextNumber++)//Next number is initialized and incremented
		{
			cubeOfNumber=nextNumber*nextNumber*nextNumber;//Cube of numbers i calculated
			System.out.println("Number is: "+nextNumber+" and cube of "+nextNumber+"is: "+cubeOfNumber);
		}
	}
}
