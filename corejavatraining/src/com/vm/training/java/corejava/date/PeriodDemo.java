package com.vm.training.java.corejava.date;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class PeriodDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your date of birth in format yyyy-MM-dd for example 1999-03-03");
		String dateOfBirth=input.next();
		LocalDate bdDate=LocalDate.parse(dateOfBirth);
		LocalDate today = LocalDate.now();
		Period period =Period.between(bdDate, today);
		System.out.println(period.getYears()+" years "+period.getMonths()+" months "+period.getDays()+" days");
		
	}
}
