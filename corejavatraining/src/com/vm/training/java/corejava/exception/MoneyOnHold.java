package com.vm.training.java.corejava.exception;

public class MoneyOnHold extends Exception
{
	String message;
	public MoneyOnHold(String message) 
	{
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
	
}