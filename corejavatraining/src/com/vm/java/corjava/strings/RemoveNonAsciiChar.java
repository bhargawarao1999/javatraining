package com.vm.java.corjava.strings;

public class RemoveNonAsciiChar {
	 public static void main(String a[]){
	        String str = "abc*************def";
	        System.out.println(str);
	        str = str.replaceAll("[^\\p{ASCII}]", "");
	        System.out.println("After removing non ASCII chars:");
	        System.out.println(str);
	    }
}
