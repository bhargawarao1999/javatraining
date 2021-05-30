package com.vm.training.java.corejava.exception;

public class AverageMonthlyCharges extends Exception
{
	String message;
	public AverageMonthlyCharges(String message) 
	{
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
	
}