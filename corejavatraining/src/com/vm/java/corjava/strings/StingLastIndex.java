package com.vm.java.corjava.strings;

public class StingLastIndex {
	public static void main(String a[]){
	     
        String str = "Use this string for testing this";
        System.out.println("Basic lastIndexOf() example");
        System.out.println("Char 's' at last occurance: "+str.lastIndexOf('s'));
        System.out.println("String \"this\" at last occurance: "+str.lastIndexOf("this"));
        System.out.println("first occurance of char 's' from 24th index backwards: "
                            +str.lastIndexOf('s',24));
        System.out.println("First occurance of String \"this\" from 26th index backwards: "
                            +str.lastIndexOf("this",26));
    }
}
