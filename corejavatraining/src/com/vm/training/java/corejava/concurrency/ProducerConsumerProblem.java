package com.vm.training.java.corejava.concurrency;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class ProducerConsumerProblem {
	public static void main(String[] args) {
		BlockingQueue<Integer> bq=new LinkedBlockingQueue<Integer>();
			Producer producer = new Producer(bq);
			Consumer consumer = new Consumer(bq);
	}
}
