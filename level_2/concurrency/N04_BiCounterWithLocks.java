package com.leveltwo.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class N04_BiCounterWithLocks {
	private int i = 0;
	private int j = 0;
	private Lock LockForI = new ReentrantLock();
	private Lock LockForJ = new ReentrantLock();

	public void incrementI() {
		LockForI.lock();
		i++;
		LockForI.unlock();
	}

	public void incrementJ() {
		LockForJ.lock();
		j++;
		LockForJ.unlock();
	}

	public int getI() {
		return i;
	}

	public int getJ() {
		return j;
	}
}
