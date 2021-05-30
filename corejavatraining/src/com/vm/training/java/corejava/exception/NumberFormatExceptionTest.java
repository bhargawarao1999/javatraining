package com.vm.training.java.corejava.exception;

import java.util.*;

public class NumberFormatExceptionTest {
	public static void main(String[] arg)
	{
		int number;
		Scanner input = new Scanner(System.in);
		// Display message
		System.out.println("Enter any valid Integer: ");
		try {

			number = Integer.parseInt("12345j");

			// Number can be valid or invalid

			// If number is valid, print and display
			// the message and number
			System.out.println("You entered: "+ number);
		}
		catch (NumberFormatException e) {

			// Print the message if exception occured
			System.out.println("NumberFormatException occured");
		}
	}
}
