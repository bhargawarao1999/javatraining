package com.vm.training.java.corejava.exception;

public class ProductNotOnTime extends Exception
{
	String message;
	public ProductNotOnTime(String message){
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
}
