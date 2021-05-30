package com.vm.training.java.corejava.collection;

import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Movie implements Comparable<Movie>
{
	String name;
	private double ratings;
	private int year;
	
	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Movie(String name, double ratings, int year) {
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
