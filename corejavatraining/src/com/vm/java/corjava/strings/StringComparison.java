package com.vm.java.corjava.strings;

public class StringComparison {
	public static void main(String a[]){
        String x = "JUNK";
        String y = "junk";
        if(x.equals(y)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
        if(x.equalsIgnoreCase(y)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
	}
}
