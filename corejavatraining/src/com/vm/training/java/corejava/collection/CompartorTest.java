package com.vm.training.java.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;
public class CompartorTest {
	public static void main(String[] args) {
		ArrayList<Product> productList= new ArrayList<Product>();
		productList.add(new Product(1, "Laptop", 40000));
		productList.add(new Product(2, "TV", 2001));
		productList.add(new Product(3, "AC", 15001));
		productList.add(new Product(4, "Mobile", 13000));
		System.out.println(productList);

		System.out.println("Product List");
		for(Product product:productList)
			System.out.println(product);

		System.out.println("Product List Price greater than 10000");
		for(Product product:productList)
		{
			if(product.getPrice()>10000)
				System.out.println(product.getName());
		}
		System.out.println("By Price");
		Collections.sort(productList, new PriceSorting());
		for(Product product:productList)
			System.out.println(product);
		System.out.println("By Name");
		
		Collections.sort(productList, new NameSorting());
		for(Product product:productList)
			System.out.println(product);

	}

}
