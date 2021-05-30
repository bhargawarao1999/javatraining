package com.vm.training.java.project;

import java.util.Scanner;

public class Breakfast implements Menu
{
	int itemNumber;
	Scanner input=new Scanner(System.in);
	@Override
	public void menu() {
		
		System.out.println("Breakfast Menu");
		System.out.println("-----------------------------------------------");
		System.out.println("1. Dosa                ---20RS");
		System.out.println("2. Idly                ---20RS");
		System.out.println("3. Puri                ---20RS");
		System.out.println("4. Bread Omelete       ---20RS");
		System.out.println("5. Mysorbonda          ---20RS");
		System.out.println("Enter the item number you need: ");
		itemNumber=input.nextInt();
		switch(itemNumber)
		{
		case 1:
			System.out.println("Dosa");
			break;
		case 2:
			System.out.println("Idly");
			break;
		case 3:
			System.out.println("Puri");
			break;
		case 4:
			System.out.println("Bread Omelete");
			break;
		case 5:
			System.out.println("Mysorbonda");
		}
	}
}