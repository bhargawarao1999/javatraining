package com.vm.training.java.corejava.collection.assignment;

public class ScoreCard 
{
	String name;
	int score;
	public ScoreCard(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	public ScoreCard() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}

}	