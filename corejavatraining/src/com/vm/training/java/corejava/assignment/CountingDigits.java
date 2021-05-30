package com.vm.training.java.corejava.assignment;

public class CountingDigits 
{
	public static void main(String[] args) {
		int number =Integer.parseInt(args[0]);
		int count=0;
		while(number>0)
		{
			count++;//counting digits
			number=number/10;
		}
		System.out.println(count);
	}
}
