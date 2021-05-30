package com.vm.training.java.project;

import java.util.Scanner;

public class Cafeteria
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int time;
		Scanner input = new Scanner(System.in);
		time=input.nextInt();// Need to take automatic input as time
		Menu breakfast = (Menu) new Breakfast();
		Menu lunch = (Menu) new Lunch();
		Menu dinner = (Menu) new Dinner();
		Menu brunch = (Menu) new Brunch();
		if (time>=7 && time<=9)//Setting a time 
			breakfast.menu();
		else if(time>=10 && time<=12)
			brunch.menu();
		else if(time>=13 && time<=15)
			lunch.menu();
		else if(time>=19 && time<=22)
			dinner.menu();
			
	}
}
