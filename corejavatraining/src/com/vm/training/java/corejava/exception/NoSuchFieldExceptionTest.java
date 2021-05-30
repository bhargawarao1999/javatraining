package com.vm.training.java.corejava.exception;

import java.text.DateFormat.Field;

public class NoSuchFieldExceptionTest {
	String str;
	public static void main(String[] args) {  
		   
	      NoSuchFieldException  obj = new NoSuchFieldException();  
	      Class class1 = obj.getClass();  //gets the class  
	  
	      System.out.println("Field got  =");  
	      try {  
	          
	         java.lang.reflect.Field Flds = class1.getField("str");  
	         System.out.println(" field found: " + Flds.toString());  
	      } catch(NoSuchFieldException e) {  
	         System.out.println(e.toString());  
	      }  
	   }  
	  
	   public void NoSuchFieldException() {        
	   }  
	  
	   public void NoSuchFieldExceptionTest (String str) {         
	      this.str = str;  
	   }  
}
