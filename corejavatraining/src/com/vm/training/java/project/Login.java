package com.vm.training.java.project;

import java.util.Scanner;

public class Login 
{
	String userName;
	String password;
	public Login()
	{
		@SuppressWarnings("resource")
		Scanner input=new Scanner (System.in);
		System.out.println("Enter User Name: ");
		userName=input.nextLine();
		System.out.println("Enter Password:");
		password=input.nextLine();
	}
}
