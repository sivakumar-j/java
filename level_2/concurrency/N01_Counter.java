package com.leveltwo.concurrency;

public class N01_Counter {
	private int i = 0;

	synchronized public void increment() {// thread safe
		i++;
	}

	public int getI() {// not thread safe
		return i;
	}

}
