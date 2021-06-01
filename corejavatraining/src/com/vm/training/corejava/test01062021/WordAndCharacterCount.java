package com.vm.training.corejava.test01062021;

import java.util.Scanner;

public class WordAndCharacterCount {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter a Sytring: ");
	String str = input.nextLine();
	System.out.println("Word->");
	int wordCount=0;
	for(int i= 0;i<str.length();i++)
	{
		if(str.charAt(i)==' ')
			wordCount++;
	}
	System.out.println(wordCount+1);
	String str2=str.replace(" ", "");
	System.out.println("Char Count-> "+str2.length());
	}
}
