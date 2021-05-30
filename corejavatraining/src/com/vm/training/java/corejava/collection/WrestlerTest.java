package com.vm.training.java.corejava.collection;
import java.util.ArrayList;
import java.util.Collections;
public class WrestlerTest {
	public static void main(String[] args) {
		ArrayList<Wrestler>wrestlerList=new ArrayList<Wrestler>();
		wrestlerList.add(new Wrestler("John Cena", 175, 80));
		wrestlerList.add(new Wrestler("Khali", 200, 110));
		wrestlerList.add(new Wrestler("UnderTaker", 190, 100));
		wrestlerList.add(new Wrestler("Kane", 185, 189));
		System.out.println("Before any Sorting");
		for(Wrestler wrestler:wrestlerList)
			System.out.println(wrestler);
		
		System.out.println("Sorting by height");
		Collections.sort(wrestlerList, new SortingByHeight());
		for(Wrestler wrestler:wrestlerList)
			System.out.println(wrestler);
		System.out.println("Sorting by Weight");
		Collections.sort(wrestlerList, new SortingByWeight());
		for(Wrestler wrestler:wrestlerList)
			System.out.println(wrestler);
	}
}
