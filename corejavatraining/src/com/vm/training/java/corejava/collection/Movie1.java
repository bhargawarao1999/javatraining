package com.vm.training.java.corejava.collection;

public class Movie1 implements Comparable<Movie1>
{
	String name;
	private double ratings;
	private int year;
	@Override
	public int compareTo(Movie1 m) {
		// TODO Auto-generated method stub
		return this.year-m.year;
	}
	public Movie1(String name, double ratings, int year) {
		super();
		this.name = name;
		this.ratings = ratings;
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public double getRatings() {
		return ratings;
	}
	public int getYear() {
		return year;
	}
	
}
