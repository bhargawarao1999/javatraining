package com.vm.training.java.corejava.assignment;

public class GreatestNumber {

	public static void main(String[] args) {
		
		int num1,num2,num3;//num is Number
		
		//Give integer number with spaces as input
		num1=Integer.parseInt(args[0]);
		num2=Integer.parseInt(args[1]);
		num3=Integer.parseInt(args[2]);
		
		//Comparing numbers
		if(num1>num2&&num1>num3)
			System.out.println("The greatest:"+num1);
		else if(num2>num3)
			System.out.println("The greatest:"+num2);
		else
			System.out.println("The greatest:"+num3);
	}

}
