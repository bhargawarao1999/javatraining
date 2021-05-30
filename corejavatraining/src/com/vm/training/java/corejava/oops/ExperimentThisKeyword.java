package com.vm.training.java.corejava.oops;

public class ExperimentThisKeyword {
	public static int thisKey;
	public static void Experiment (int thisKey) 
	{
		this.thisKey=thisKey;
	}
	void show()
	{
		System.out.println(thisKey);
	}

}
