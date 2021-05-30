package com.vm.training.java.project;

import java.util.Scanner;

public class Brunch implements Menu {
	int itemNumber;
	Scanner input=new Scanner(System.in);
	@Override
	public void menu() {
		
		System.out.println("Brunch Menu");
		System.out.println("-----------------------------------------------");
		System.out.println("1. Tea and Bread         ---30 Rs");
		System.out.println("2. Tea and Biscuit       ---20 Rs");
		System.out.println("3. Coffee and Bread      ---30 Rs");
		System.out.println("4. Coffee and Biscuit    ---20 Rs");
		System.out.println("5. Waffel                ---50 Rs");
		System.out.println("Enter the item number you need: ");
		itemNumber=input.nextInt();
		switch(itemNumber)
		{
		case 1:
			System.out.println("Tea and Bread");
			break;
		case 2:
			System.out.println("Tea and Biscuit");
			break;
		case 3:
			System.out.println("Coffee and Bread");
			break;
		case 4:
			System.out.println("Coffee and Biscuit");
			break;
		case 5:
			System.out.println("Waffel");
		}
	}
}
