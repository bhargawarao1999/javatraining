package com.vm.training.java.corejava.collection;
import java.util.HashMap;
import java.util.Set;
public class HashMapTest 
{
	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("1000", "Bhargawa");
		hm.put("1001", "Nitesh");
		hm.put("1002", "Hari");
		hm.put("1001", "Bhargawa");
		hm.put("1003", "Bharadwaj");
		hm.put("1004", "Rakesh");
		hm.put(null, "Bhargawa");
		hm.put("1000", null);

		//		Set <String> keys  = hm.keySet();
		//        for(String key: keys){
		//            System.out.println("Value of "+key+" is: "+hm.get(key));
		HashMap hmCopy = new HashMap();
		hmCopy.put("1005", "Nitesh");
		hmCopy.put("1006", "ManiTeja");
		hmCopy.put("1007", "Sasi");
		hm.putAll(hmCopy);
		System.out.println(hm);
		System.out.println("hm contains key 1001: "+hm.containsKey("1001"));
		System.out.println("hm contains value Bhargawa: "+hm.containsValue("Bhargawa"));
		System.out.println("hm contains key 1008: "+hm.containsKey("1008"));
		System.out.println("hm contains value Bhargawa: "+hm.containsValue("ABCD"));
		Set <String> keys = hm.keySet();
		for(String key: keys)
			System.out.println(key);
		
	}
}
