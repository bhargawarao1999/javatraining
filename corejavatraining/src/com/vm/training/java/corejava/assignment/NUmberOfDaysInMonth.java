package com.vm.training.java.corejava.assignment;

public class NUmberOfDaysInMonth 
{
	public static void main(String[] args) {
		int numberOfDaysInMonth = 0; 
		String nameOfTheMonth = null;
		int month=Integer.parseInt(args[0]);
		int year =Integer.parseInt(args[1]);

		switch (month) {
		case 1:
			nameOfTheMonth = "January";
			numberOfDaysInMonth = 31;
			break;
		case 2:
			nameOfTheMonth = "February";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				numberOfDaysInMonth = 29;
			} else {
				numberOfDaysInMonth = 28;
			}
			break;
		case 3:
			nameOfTheMonth = "March";
			numberOfDaysInMonth = 31;
			break;
		case 4:
			nameOfTheMonth = "April";
			numberOfDaysInMonth = 30;
			break;
		case 5:
			nameOfTheMonth = "May";
			numberOfDaysInMonth = 31;
			break;
		case 6:
			nameOfTheMonth = "June";
			numberOfDaysInMonth = 30;
			break;
		case 7:
			nameOfTheMonth = "July";
			numberOfDaysInMonth = 31;
			break;
		case 8:
			nameOfTheMonth = "August";
			numberOfDaysInMonth = 31;
			break;
		case 9:
			nameOfTheMonth = "September";
			numberOfDaysInMonth = 30;
			break;
		case 10:
			nameOfTheMonth = "October";
			numberOfDaysInMonth = 31;
			break;
		case 11:
			nameOfTheMonth = "November";
			numberOfDaysInMonth = 30;
			break;
		case 12:
			nameOfTheMonth = "December";
			numberOfDaysInMonth = 31;
		}
		System.out.println(nameOfTheMonth+" has "+numberOfDaysInMonth+" days");
	}
}
