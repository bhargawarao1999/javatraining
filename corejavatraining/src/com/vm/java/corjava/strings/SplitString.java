package com.vm.java.corjava.strings;

import java.util.Scanner;

public class SplitString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s="I am an employee of ValueMomentum";
		String s1="I am an employee of ValueMomentum";
		s1=s.split("Employee",2);
		for(String s2 : s1)
	}
}
