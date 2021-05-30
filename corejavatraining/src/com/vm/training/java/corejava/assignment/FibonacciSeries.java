package com.vm.training.java.corejava.assignment;

public class FibonacciSeries 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number=Integer.parseInt(args[0]);
		int num1=0;
		int num2=1;
		int num3=0;
		System.out.print("0 1");//First 2 numbers 
		for(int i=2;i<number;i++)//After 2 numbers execution starts
		{
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}
}
