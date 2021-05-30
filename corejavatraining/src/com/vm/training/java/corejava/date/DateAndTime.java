package com.vm.training.java.corejava.date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DateAndTime {
	public static void main(String[] args) {
		LocalDate today= LocalDate.now();
		System.out.println(today);
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Today: "+today);
		System.out.println("Next Day: "+today.plusDays(1));
		LocalDate bookingDate= LocalDate.of(2021,05,30);
		if(bookingDate.isAfter(today))
			System.out.println("You can book today");
		else
			System.out.println("Enered invalid Date"); 
	}
}
