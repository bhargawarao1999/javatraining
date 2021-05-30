package com.vm.training.java.corejava.assignment;

public class RightAngleTriangleWithNumber {
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int firstNumber=1,nextNumber,lasttNumber;
		for(lasttNumber=firstNumber;lasttNumber<=number;lasttNumber++)//End number is initialized after the execution it increments
		{
			for(nextNumber=1;nextNumber<=lasttNumber;nextNumber++)
				System.out.print(nextNumber);//from number 1 to end numbers are executed
			System.out.println("");//For newline 
		}
	}
}
