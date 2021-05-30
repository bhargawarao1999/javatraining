package com.vm.training.java.corejava.exception;

import java.util.Scanner;

public class ByZero 
{
	public static void main(String[] args) {
		try
		{
			Scanner input = new Scanner(System.in);
			int num[]=new int[10];
			System.out.println(num[11]);
		}
		catch(Exception e)
		{
			System.out.println("Array out of Bound");
		}
	}
}
