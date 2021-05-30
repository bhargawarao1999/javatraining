package com.vm.training.java.corejava.basics;

import java.util.ArrayList;
import java.util.Collections;

public class RemovingDuplicates {
	public static void main(String[] args) {
		ArrayList<String> javabatch= new ArrayList<String>();
		javabatch.add("ravi");
		javabatch.add("john");
		javabatch.add("anil");
		javabatch.add("kumar");
		javabatch.add("manoj");
		ArrayList<String> sqlbatch= new ArrayList<String>();
		sqlbatch.add("saurab");
		sqlbatch.add("ankita");
		sqlbatch.add("john");
		sqlbatch.add("kumar");
		sqlbatch.add("manoj");
		javabatch.removeAll(sqlbatch);
		javabatch.addAll(sqlbatch);
		Collections.sort(javabatch);
		System.out.println(javabatch);
		
	}
}
