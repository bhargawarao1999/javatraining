package com.vm.training.java.corejava.assignment;

public class SumAndAverage {
	public static void main(String[] args) 
	{
		int num1=Integer.parseInt(args[0]);
		int num2=Integer.parseInt(args[1]);
		int num3=Integer.parseInt(args[2]);
		int num4=Integer.parseInt(args[3]);
		int num5=Integer.parseInt(args[4]);
		int sum=num1+num2+num3+num4+num5;//Total
		int avg=sum/5;//Average of 5 numbers
		System.out.println("The sum of 5 no is : "+sum);
		System.out.println("The Average is : "+avg);
	}
}
