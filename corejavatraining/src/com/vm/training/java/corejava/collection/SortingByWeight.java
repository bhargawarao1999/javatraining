package com.vm.training.java.corejava.collection;

import java.util.Comparator;

public class SortingByWeight implements Comparator<Wrestler>
{
	public int compare(Wrestler h1, Wrestler h2) 
	{
		if(h1.height==h2.height)
			return 0;
		else if(h1.height>h2.height)
			return -1;
		else 
			return 1;
	}
}
