package com.leveltwo.concurrency;

public class N03_ConcurrencyRunner {
	public static void main(String[] args) {
		N02_BiCounter counter = new N02_BiCounter();
		counter.incrementI();
		counter.incrementJ();
		counter.incrementI();
		System.out.println("BiCounter : " + counter.getI());
		/*
		 * Both incrementI() and incrementJ() of class BiCounter are synchronized.
		 * Therefore, at any given time, at most one thread can execute either of these
		 * methods! Which means that , while a thread T1 is executing
		 * counter.incrementI() within ConcurrencyRunner.main(), another thread T2 is
		 * not allowed to execute counter.incrementJ()!
		 */


		N04_BiCounterWithLocks bicntlock = new N04_BiCounterWithLocks();
		bicntlock.incrementI();
		bicntlock.incrementJ();

		System.out.println("BicounterwithLock : " + bicntlock.getI());

		N05_BiCounterWithAtomicInteger bicntai = new N05_BiCounterWithAtomicInteger();
		bicntai.incrementI();
		bicntai.incrementJ();

		System.out.println("BicounterwithAtomicInt : " + bicntai.getI());

	}

}
