package com.vm.training.java.corejava.collection;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie1>
{

	@Override
	public int compare(Movie1 m1, Movie1 m2) {
		// TODO Auto-generated method stub
		if(m1.getRatings()<m2.getRatings())
			return -1;
		else if(m1.getRatings()>m2.getRatings())
			return 1;
		else
			return 0;
	}

}
