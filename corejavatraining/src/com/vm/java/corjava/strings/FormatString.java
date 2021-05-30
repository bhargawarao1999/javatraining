package com.vm.java.corjava.strings;

import java.util.*;

public class FormatString {
	 public static void main(String a[]){
	     
	        String str = "This is %s format example";
	        System.out.println(String.format(str, "string"));
	        String str1 = "We are displaying no %d";
	        System.out.println(String.format(str1, 10));
	        System.out.println("String format with Locale info:");
	        System.out.println(String.format(Locale.US, str1, 10));
	    }
}
