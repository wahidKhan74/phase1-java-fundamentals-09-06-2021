package com.simplilearn.multithreading;

public class ThreadWithLamdaExpression {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			System.out.println("The ABC thread is ruuning !");
		});

		t1.start();

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("The Xyz thead is running !");
			}
		});
		t2.start();
	}

}
