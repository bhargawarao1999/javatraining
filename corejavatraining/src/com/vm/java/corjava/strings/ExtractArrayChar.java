package com.vm.java.corjava.strings;

public class ExtractArrayChar {
	public static void main(String a[]){
	     
        String str = "Copy chars from this string";
        char[] ch = new char[5];
        str.getChars(5, 10, ch, 0);
        System.out.println(ch);
    }
}
