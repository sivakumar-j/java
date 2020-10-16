package com.leveltwo.packageone;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task11 extends Thread {
	@Override
	public void run() {
		System.out.println("Task1 Started ");
		for(int i=101; i<=109; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 Done");
	}
}

class Task22 implements Runnable {
	@Override
	public void run() {
		System.out.println("Task2 Started ");
		for(int i=201; i<=209; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 Done");
	}
}


public class n11_ExecutorServiceRunner {
	public static void main(String[] args) {
		// ExecutorService executorService = Executors.newSingleThreadExecutor();
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		executorService.execute(new Task11());
		// executorService.execute(new Task22());
		executorService.execute(new Thread(new Task22()));
		System.out.print("\nTask3 Kicked Off\n");

		for (int i = 301; i <= 309; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 Done");
		System.out.println("\nMain Done");
		executorService.shutdown();
		// Threads managed by ExecutorService run in parallel with main method.
	}
}
