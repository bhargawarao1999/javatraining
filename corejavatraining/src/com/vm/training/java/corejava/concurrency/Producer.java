package com.vm.training.java.corejava.concurrency;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable{
	BlockingQueue<Integer> commonQueue;
	public Producer (BlockingQueue<Integer>commonQueue)
	{
		super();
		commonQueue=commonQueue;
	}
	@Override
	public void run() {
		for(int i=1;i<10;i++)
		{
			commonQueue.add(i);
			System.out.println("Element add"+i);
			System.out.println("Queue elements are "+commonQueue);
		}
		
	}
}
