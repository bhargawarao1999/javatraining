package com.vm.training.java.corejava.collection;

public class Wrestler {
	String name;
	int height;
	int weight;
	public Wrestler(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Wrestler [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	
}
