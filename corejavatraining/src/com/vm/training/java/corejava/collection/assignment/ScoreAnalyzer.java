package com.vm.training.java.corejava.collection.assignment;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class ScoreAnalyzer 
{
	
	private LinkedList<Integer> runsData=new LinkedList<Integer>();
	
	public ScoreAnalyzer( LinkedList<Integer> runData) {
		super();
		
		this.runsData = runData;
	}
	
	public ScoreAnalyzer() {
		super();
	}
	public LinkedList<Integer> getRunData() {
		return runsData;
	}
	public void setRunData(LinkedList<Integer> runData) {
		this.runsData = runData;
	}
	void addRunsToList(int runs)
	{
		runsData.add(runs);
	}
	double calcRunRate()
	{
		double run=0;
		Iterator<Integer> iterator=runsData.iterator();
		while(iterator.hasNext())
		{
			run=run+iterator.next();
		}
		return (run/50);
		
	}
	int lowestRunsScored()
	{
		return Collections.min(runsData);
	}
	void displayRuns()
	{
		for(Integer s: runsData)
		{
			System.out.print(s+" ");
		}
	}

	int CountPlayers()
	{
		return runsData.size();
	}

	

}
