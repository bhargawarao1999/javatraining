package com.vm.training.java.corejava.collection;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap lhm = new LinkedHashMap();
		lhm.put("1", "Hari");
		lhm.put("2", "Bharadwaj");
		lhm.put("3", "Rakesh");
		lhm.put("4", "Nitesh");
		lhm.put("3", "Bathu");
		System.out.println(lhm);
		Set<String> keys=lhm.keySet();
		for(String key:keys)
			System.out.println(key);
		
	}
}
