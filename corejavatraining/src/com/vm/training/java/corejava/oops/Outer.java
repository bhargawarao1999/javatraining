package com.vm.training.java.corejava.oops;

public class Outer 
{
 int i=40;
 void show()
 {
	 System.out.println(i);
 }
 public class Inner
 {
		int a=200;
		void display()
		{
			show();
			System.out.println(a);
		}
 }
}
