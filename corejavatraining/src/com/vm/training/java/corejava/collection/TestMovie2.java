package com.vm.training.java.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestMovie2 {
	public static void main(String[] args) {

		ArrayList<Movie1> list = new ArrayList<Movie1>();

		list.add(new Movie1("Force Awakens",8.3,2015));
		list.add(new Movie1("Star Wars",8.7,1977));
		list.add(new Movie1("Empire Strikes Back",8.8,1980));
		list.add(new Movie1("Return of Jedi",8.8,1983));
		System.out.println("Sorted by rating");
		RatingCompare ratingCompare = new RatingCompare();
		Collections.sort(list);
		for(Movie1 movie: list)
			System.out.println(movie.getName()+" "+ movie.getRatings()+" "+movie.getYear());
		System.out.println("\n Sorted by name");
		NameCompare nameCompare= new NameCompare();
		Collections.sort(list, nameCompare);
		for(Movie1 movie: list)
			System.out.println(movie.getName()+" "+movie.getRatings()+" "+movie.getYear());
		
			
	}
}
