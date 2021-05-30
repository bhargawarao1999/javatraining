package com.vm.training.java.corejava.assignment;

public class LeapYear {
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);//Give an year as input
		int leapYear = 1;//1= Not a leap year, 0=Yes a leap year

		// If the year is divisible by 4
		if (year % 4 == 0) 
		{

			// Weather the year is century.
			if (year % 100 == 0) {

				// If year is divisible by 400 then it is a leap year
				if (year % 400 == 0)
					leapYear = 0;
				else
					leapYear = 1;
			}

			// If the year is not century
			else
				leapYear = 0;
		}

		else
			leapYear = 1;

		if (leapYear==0)
			System.out.println(year + " is a leap year.");
		else
			System.out.println(year + " is not a leap year.");
	}
}
