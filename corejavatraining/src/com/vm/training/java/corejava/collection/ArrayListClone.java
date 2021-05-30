package com.vm.training.java.corejava.collection;

import java.awt.List;
import java.util.ArrayList;

public class ArrayListClone {
	public static void main(String[] args) {
		ArrayList array = new ArrayList();
		array.add("Bhargawa");
		array.add("Nitesh");
		array.add(20);
		array.add(1.25);
		array.add("Mamaaaa");
		//Copying whole arraylist to another arraylist
		ArrayList arrayCopy = (ArrayList) array.clone();
		//System.out.println(arrayCopy);
		ArrayList list = new ArrayList();
		list.add("Rakesh");
		list.add("Bharadwaj");
		array.addAll(list);
		//After adding whole list to another list
		System.out.println(array);
	}
}
