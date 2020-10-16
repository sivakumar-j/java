package com.leveltwo.packageone;

class Task1 extends Thread {
	@Override
	public void run() {
		for (int i = 101; i <= 109; i++) {
			System.out.println(i + " ");
		}
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		for (int i = 201; i <= 209; i++) {
			System.out.println(i + " ");
		}
	}
}

public class n10_ThreadBasicsRunner {
	public static void main(String[] args) throws InterruptedException {
		Task1 task1Thread = new Task1();
		task1Thread.start();
		Task2 task2 = new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		task1Thread.join();
		task2Thread.join();
		for (int i = 301; i <= 309; i++) {
			System.out.println(i + " ");
		}
	}
}

