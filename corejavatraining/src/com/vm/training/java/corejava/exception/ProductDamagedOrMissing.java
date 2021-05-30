package com.vm.training.java.corejava.exception;

public class ProductDamagedOrMissing extends Exception{
	String message;
	public ProductDamagedOrMissing(String message){
		this.message=message;
	}
	@Override
	public String toString() {
		return message;
	}
}
