package com.vm.training.java.corejava.exception;

public class ProductNotRecieved extends Exception 
{
	String message;
	public ProductNotRecieved(String message){
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
}
