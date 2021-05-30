package com.vm.java.newFeatures;

import java.util.Arrays;
import java.util.List;

public class StreamDemo {
	public static void main(String[] args) {
		List<Integer> array =Arrays.asList(12,4,8,1,49,55,78,47,25,22);
		array.forEach(s->System.out.println(s));
		System.out.println("Number of array elements: "+array.stream().count());
		System.out.println("NUmber greater than 30");
		array.stream().filter(s->s>30).forEach(s->System.out.println(s));
		System.out.println("Adding 100 to each number");
		array.stream().map(s->s+100).forEach(s->System.out.println(s));
	}
}
