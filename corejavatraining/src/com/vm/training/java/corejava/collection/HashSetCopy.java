package com.vm.training.java.corejava.collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCopy {
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet();
		hs.add("Abcd");
		hs.add("Bhargawa");
		hs.add("Nitesh");
		hs.add("Hari");
		HashSet<String> hsCopy=new HashSet<String>();
		hsCopy.add("Rakesh");
		hsCopy.add("Bharadwaj");
		hs.addAll(hsCopy);
		System.out.println(hs);
		Iterator itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		hs.clear();
		System.out.println("After deleting all the : "+hs);
		
		String [] str = new String [hs.size()];
		hs.toArray(str);
		for(String str1:str){
            System.out.println(str);
        }
	}
}
