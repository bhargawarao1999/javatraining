package com.vm.training.java.corejava.exception;

public class ClassNotFoundTest 
{
	public static void main(String[] args) {
		try {
			Class.forName("Abcd");
			System.out.println("Found Class");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
