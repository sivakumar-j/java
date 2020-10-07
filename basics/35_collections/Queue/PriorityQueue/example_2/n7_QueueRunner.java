package com.basics.packageone;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {
	@Override
	public int compare(String left, String right) {
		return Integer.compare(left.length(), right.length());
	}
}

public class n7_QueueRunner {
	public static void main(String[] args) {
		//Comparator<String> v_compare = new StringLengthComparator();
		Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
		queue.addAll(List.of("Zebra", "Monkey", "Cat"));
		System.out.println("Queue is :" + queue);
		System.out.println("Polling : " + queue.poll() + " " + queue.poll() + " " + queue.poll());
		System.out.println("Queue is :" + queue);

	}
}
