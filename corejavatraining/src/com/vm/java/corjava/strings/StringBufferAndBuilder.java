package com.vm.java.corjava.strings;

public class StringBufferAndBuilder 
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("abcd");
		StringBuilder sbf=new StringBuilder("12345");
		sbf=sbf.append("xyz");
		System.out.println(sbf);
		sb=sb.append("12345");
		System.out.println(sb);
		
	}
}
