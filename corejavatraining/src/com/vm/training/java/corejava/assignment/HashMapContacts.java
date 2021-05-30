package com.vm.training.java.corejava.assignment;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapContacts {

	static HashMap addContact(HashMap contacts, String name,String contactNumber)
	{
		contacts.put(name, contactNumber);
		return contacts;

	}
	static HashMap removeContact(HashMap contacts, String name)
	{
		contacts.remove(name);
		return contacts;
	}
	static void displayContacts(HashMap contacts)
	{
		System.out.println(contacts);
	}
	public static void main(String[] args) {
		int n=1;
		HashMap contacts = new HashMap();
		while(n!=0)
		{
		System.out.println("Check any one of the below:");
		System.out.println("0. Exit");
		System.out.println("1. Add Contacts");
		System.out.println("2. Remove Contacts ");
		System.out.println("3. Show All Contacts");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		switch (choice) {
		case 0:
			n=choice;
		break;
		case 1:
			System.out.println("Enter Name and Contact Number");
			String name=input.next();
			String contactNumber=input.next();
			addContact(contacts, name, contactNumber);
			break;

		case 2:
			System.out.println("Enter the name of the contact holder to be deleted");
			String name1=input.next();
			removeContact(contacts, name1);
		break;
		case 3:displayContacts(contacts);
		}
		}
	}
}
