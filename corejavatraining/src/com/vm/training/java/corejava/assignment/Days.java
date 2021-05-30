package com.vm.training.java.corejava.assignment;

public class Days {

	public static void main(String[] args) {
		int numberDay=Integer.parseInt(args[0]);//Which day we want to select
		String day = null;
		//Switch case takes one of the code block to be executed.If it has the input number;
		switch (numberDay) {
		case 1:
			day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";
		}
		System.out.println(day);

	}

}
