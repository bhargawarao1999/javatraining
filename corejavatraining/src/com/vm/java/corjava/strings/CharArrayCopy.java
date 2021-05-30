package com.vm.java.corjava.strings;

public class CharArrayCopy {
	 public static void main(String a[]){
	        char ch[] = {'B','h','a','r','g','a','w','a',' ','R','a','o'};
	        
	        String chStr = String.copyValueOf(ch);
	        System.out.println(chStr);
	        String subStr = String.copyValueOf(ch,3,4);
	        System.out.println(subStr);
	 }
}
