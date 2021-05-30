package com.vm.java.newFeatures;

import java.util.*;
import java.util.function.Predicate;

public class InbuiltFunction {

	public static void main(String[] args) {
        
		//Returns boolean
		Predicate<Integer> p=(var1)->var1>2;
		System.out.println(p.test(3));
		Predicate<String> p2=(v1)->v1.startsWith("a");
		System.out.println(p2.test("apple"));
		
		

	}

}
