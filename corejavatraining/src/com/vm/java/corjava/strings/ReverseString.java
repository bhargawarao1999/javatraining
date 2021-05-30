package com.vm.java.corjava.strings;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Input a string to be reversed");
		String s1=input.nextLine();
		int i;
		for(i=1;i<=s1.length();i++)
		{
			System.out.print(s1.charAt(s1.length()-i));
		}
	}
}
