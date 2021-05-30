package com.vm.training.java.corejava.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ArrayList;
public class HashSetTest {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("1");
		hs.add(2);
		hs.add(3);
		hs.add("4");
		System.out.println("Is hashset empty?"+hs.isEmpty());
		hs.remove(2);
		System.out.println("Does hash set contains 2:"+hs.contains("3"));
		System.out.println("Does hash set contains 1:"+hs.contains("1"));
		Iterator itr = hs.iterator();
		while(itr.hasNext());
		
		
		
//		ArrayList array = new ArrayList();
//		array.add("gfxgf");
//		array.add("rety");
//		array.add("cvjjhbj");
//		
//		String s = (String)array.get(0);
//		String s1 = (String)array.get(1);
//		String s2 = (String)array.get(2);
//		System.out.println(s+" "+s1+" "+s2);
	}
}
