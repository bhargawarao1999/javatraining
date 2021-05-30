package com.vm.java.corjava.strings;

public final class ImmutableClassCreation {
	private int id;
	private String name;
	ImmutableClassCreation(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	
}
