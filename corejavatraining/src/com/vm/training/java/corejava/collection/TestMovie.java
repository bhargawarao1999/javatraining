package com.vm.training.java.corejava.collection;

import java.util.ArrayList;
import java.util.Collections;

class TestMovie
{
	public static void main(String[] args)
	{
		ArrayList<Movie> list = new ArrayList<Movie>();
		list.add(new Movie("Force Awakens",8.3,2015));
		list.add(new Movie("Star Wars",8.7,1977));
		list.add(new Movie("Empire Strikes Back",8.8,1980));
		list.add(new Movie("Return of Jedi",8.8,1983));
		Collections.sort(list);
		
		System.out.println("Movies after Sorting : ");
		for(Movie movie: list)
		{
			System.out.println(movie.getName()+" "+movie.getRatings()+" "+movie.getYear());
		}
	}
}
