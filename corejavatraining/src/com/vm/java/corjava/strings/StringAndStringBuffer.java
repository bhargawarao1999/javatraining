package com.vm.java.corjava.strings;

public class StringAndStringBuffer {
	public static void main(String a[]){
	     
        String c = "We are comparing the content with a StringBuffer content";
        StringBuffer sb =
            new StringBuffer("We are comparing the content with a StringBuffer content");
        if(c.contentEquals(sb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
        StringBuffer asb =
            new StringBuffer("You cannot compare the content with a String content");
        if(c.contentEquals(asb)){
            System.out.println("The content is equal");
        } else {
            System.out.println("The content is not equal");
        }
    }
}
