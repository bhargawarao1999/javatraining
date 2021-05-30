package com.vm.java.corjava.strings;

public class StringEndsWithAnotherValue {
	public static void main(String a[]){
	     
        String str = "This is a java string example";
        if(str.endsWith("example")){
            System.out.println("This String ends with example");
        } else {
            System.out.println("This String is not ending with example");
        }
        if(str.endsWith("java")){
            System.out.println("This String ends with java");
        } else {
            System.out.println("This String is not ending with java");
        }
	}
}
