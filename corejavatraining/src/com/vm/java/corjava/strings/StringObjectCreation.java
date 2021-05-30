package com.vm.java.corjava.strings;

public class StringObjectCreation {
	public static void main(String[] args) {
		String s1= new String("ValueMomentum");
		String s3= "ValueMomentum";
		String s2= new String("valuemomentum");
		String s4= "ValueMomentum";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s5="um";
		String s6="";
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		System.out.println(s1.concat("Bhargawa"));
		System.out.println(s2.length());
		System.out.println(s1.charAt(5));
		System.out.println(s3.toLowerCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s1.compareTo(""));
		System.out.println(s5.codePointAt(1));
		System.out.println(s1.codePointCount(0, 13));
		System.out.println(s2.compareToIgnoreCase(""));
		System.out.println(s2.compareTo(""));
		System.out.println(s2.contentEquals(s4));
		System.out.println(s1.endsWith(s5));
		System.out.println(s3.hashCode()==s1.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s6.isEmpty());
		System.out.println(s1.lastIndexOf("o"));
		System.out.println(s1.intern());
		System.out.println(s1.matches(s4));
		System.out.println(s1.indexOf(s1, 12));
		String s7="       Value               Momentum                  ";
		s7=s7.replace(" ", "");
		System.out.println(s7);
	}
}
