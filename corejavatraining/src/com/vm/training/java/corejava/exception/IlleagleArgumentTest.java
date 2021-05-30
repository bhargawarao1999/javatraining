package com.vm.training.java.corejava.exception;

import java.util.Scanner;

public class IlleagleArgumentTest {
	public static void main(String[] args) {
		try {
			int num=-1;
			if (num < 0 || num > 100)
				throw new IllegalArgumentException("value must be non-negative and below 100");
			System.out.println( num);
		}
		catch(IllegalArgumentException i) {
			System.out.println("The number is out of range encouneterd.");
		}
	} 
}
