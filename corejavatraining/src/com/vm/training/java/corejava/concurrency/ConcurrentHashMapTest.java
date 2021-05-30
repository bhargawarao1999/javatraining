package com.vm.training.java.corejava.concurrency;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapTest {
	public static void main(String[] args) {
	//	ConcurrentHashMap<String,Integer> hm=new ConcurrentHashMap<String, Integer>();
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		hm.put("Raja", 1);
		hm.put("Kaja", 2);
		hm.put("Bhargawa", 3);
//		hm.computeIfAbsent("Jaja", a->4);
//		hm.computeIfAbsent("Raja", a->1);
		System.out.println(hm);
//		for(Integer val:hm.values())
//		{
//			System.out.println(val);
//			hm.computeIfAbsent("Jaja", a->4);
//		}
		System.out.println(hm);
		for(java.util.Map.Entry<String, Integer> h:hm.entrySet())
		{
			System.out.println(h);
		}
	}
}
