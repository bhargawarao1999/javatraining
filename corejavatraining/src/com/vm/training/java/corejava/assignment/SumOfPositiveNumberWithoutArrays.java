package com.vm.training.java.corejava.assignment;

import java.util.Scanner;

public class SumOfPositiveNumberWithoutArrays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit");
		int limit,num,positiv=0;
		   limit=sc.nextInt();
		  
		   System.out.println("Enter %d numbers\n"+ limit);  
		  
		    while(limit>0)  
		    {  
		    	num=sc.nextInt(); 
		  
		        if(num > 0)  
		        {  
		            positiv=positiv+num;  
		        }   
		        limit--;  
		    }
	}
}
