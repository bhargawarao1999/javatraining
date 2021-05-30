package com.vm.training.java.corejava.exception;

public class MaintainMinimumBalance extends Exception
{
	String message;
	public MaintainMinimumBalance(String message) 
	{
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
	
}