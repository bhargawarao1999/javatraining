package com.vm.java.corjava.strings;

import java.util.Scanner;

public class StringCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
		System.out.println("Enter the string you want to search and count");
		String s;
		Scanner input = new Scanner(System.in);
		s=input.nextLine();
		int i,c=0;
		for(i=0;i<=s1.length()-s.length();i++)
		{
			if(s.equals(s1.subSequence(i, s.length()+i)))
					{
				c++;
					}
		}
		System.out.println(c);
	}

}
