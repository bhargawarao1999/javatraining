package com.vm.training.java.project;

import java.util.Scanner;

public class Lunch implements Menu
{
	int itemNumber;
	Scanner input = new Scanner(System.in);
	@Override
	public void menu() {
		System.out.println("Lunch Menu");
		System.out.println("-----------------------------------------------");
		System.out.println("1. White Rice   ---50 Rs");
		System.out.println("2. Sambar Rice  ---50 Rs");
		System.out.println("3. Lemon Rice   ---50 Rs");
		System.out.println("4. Tomato Rice  ---50 Rs");
		System.out.println("5. Curd Rice    ---50 Rs");
		System.out.println("6. Veg Biryani  ---100 Rs");
		System.out.println("Enter the item number you need: ");
		itemNumber=input.nextInt();
		switch(itemNumber)
		{
		case 1:
			System.out.println("White Rice");
			break;
		case 2:
			System.out.println("Sambar Rice");
			break;
		case 3:
			System.out.println("Lemon Rice");
			break;
		case 4:
			System.out.println("Tomato Rice");
			break;
		case 5:
			System.out.println("Curd Rice");
			break;
		case 6:
			System.out.println("Veg Biryani");
		}
	}

}
