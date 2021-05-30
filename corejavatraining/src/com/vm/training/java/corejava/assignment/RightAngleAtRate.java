package com.vm.training.java.corejava.assignment;

public class RightAngleAtRate {
	public static void main(String[] args) {
		int number=Integer.parseInt(args[0]);
		int firstNumber=1,nextNumber,lasttNumber;
		for(lasttNumber=firstNumber;lasttNumber<=number;lasttNumber++)//End number is initialized after the execution it increments
		{
			for(nextNumber=1;nextNumber<=lasttNumber;nextNumber++)
				System.out.print("@");//from number 1 to end number times @ is  executed
			System.out.println("");//For newline 
		}
	}
}
