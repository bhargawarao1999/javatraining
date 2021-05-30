package com.vm.training.java.corejava.collection.assignment;

import java.util.*;
import java.util.Map.Entry;
public class ScoreCardTest {
	static void dipalyPlayersname(HashMap<String,Integer> hm)
	{
		for (String iterable_element : hm.keySet()) 
		{
			System.out.println(iterable_element);
		}
	}
	static void scoreByplayers(HashMap<String,Integer> hm)
	{
		System.out.println(hm);
	}
	static void totalScore(HashMap<String,Integer> hm)
	{
		int sum=0;
		for(Integer i:hm.values())
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}
	static void printNameByHighScore(HashMap<String,Integer> hm)
	{
		Map.Entry<String, Integer> withMax=null;
		for(Entry<String, Integer> i:hm.entrySet())
		{
			if(withMax==null||i.getValue().compareTo(withMax.getValue())>0)
			{
				withMax=i;
			}
		}
		System.out.println(withMax);
	}
	
	public static void main(String[] args)
	{
		
		HashMap<String ,Integer> hm=new HashMap<String, Integer>();
		hm.put("Rahane" , 20);
		hm.put("Rahul", 30);
		hm.put( "Kohli", 150 );
		hm.put("Dhoni", 187);
		hm.put("Lokesh", 10);
		
		System.out.println("Players Name: ");
		dipalyPlayersname(hm);
		System.out.println("Players Score");
		scoreByplayers(hm);
		System.out.println("Total Score");
		totalScore(hm);
		System.out.println("Player name by high score");
		printNameByHighScore(hm);
		
	}

}