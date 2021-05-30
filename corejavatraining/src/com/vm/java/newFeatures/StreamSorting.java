package com.vm.java.newFeatures;

import java.util.ArrayList;
import java.util.*;
public class StreamSorting {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<Integer>();
		array.add(1);
		array.add(100);
		array.add(34);
		array.add(18);
		array.add(13);
		array.forEach(System.out::println);
		
		array.stream().sorted().forEach(System.out::println);
		
		ArrayList<String> stringArray = new ArrayList<String>();
		stringArray.add("Bhargawa");
		stringArray.add("Nitesh");
		stringArray.add("hari");
		stringArray.add("Rakesh");
		stringArray.add("Bharadwaj");
		stringArray.stream().sorted().forEach(System.out::println);
		
		
	} 
}
