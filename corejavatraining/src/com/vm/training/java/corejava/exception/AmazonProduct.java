package com.vm.training.java.corejava.exception;

import java.util.*;

public class AmazonProduct {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Select one of the option below");
		System.out.println("1.Product not on Time");
		System.out.println("2.Product is damaged or missing");
		System.out.println("3.Product not Recieved");
		int choosen=input.nextInt();
		
		try
		{
			switch(choosen)
			{
			case 1:
				throw new ProductNotOnTime("Money will be Refunded");
			case 2:
				throw new ProductDamagedOrMissing("Product will be replaced");
			case 3:
				throw new ProductNotRecieved("Product arrival is delayed by 1 day ");
			}
		}
		catch(ProductNotOnTime e1)
		{
			e1.printStackTrace();
		}
		catch(ProductDamagedOrMissing e2)
		{
			e2.printStackTrace();
		}
		catch(ProductNotRecieved e3)
		{
			e3.printStackTrace();
		}

	}


}
