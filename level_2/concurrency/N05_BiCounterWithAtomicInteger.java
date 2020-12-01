package com.leveltwo.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class N05_BiCounterWithAtomicInteger {
	private AtomicInteger i = new AtomicInteger();
	private AtomicInteger j = new AtomicInteger();

	public void incrementI() {
		// System.out.println("I is :");
		i.incrementAndGet();
	}

	public void incrementJ() {
		// System.out.println("J is :");
		j.incrementAndGet();
	}

	public int getI() {
		return i.get();
	}

	public int getJ() {
		return j.get();
	}
}
