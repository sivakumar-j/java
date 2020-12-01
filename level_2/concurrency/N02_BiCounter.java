package com.leveltwo.concurrency;

//synchronized keyword make the code thread safe. However,
//it causes all other threads to wait. This can result in performance issues

public class N02_BiCounter {
	private int i = 0;
	private int j = 0;

	synchronized public void incrementI() {
		i++;
	}

	synchronized public void incrementJ() {
		j++;
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}


}
