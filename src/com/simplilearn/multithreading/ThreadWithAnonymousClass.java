package com.simplilearn.multithreading;

public class ThreadWithAnonymousClass {

	public static void main(String[] args) {
		
		Runnable threadObj = new Runnable (){

			@Override
			public void run() {
				System.out.println("The ABC thread is ruuning !");
				
			}
			
		};
		
		Runnable threadObj2 = new Runnable() {
			
			@Override
			public void run() {
				for(int i=0 ; i < 5; i++) {
					System.out.println("The Xyz thead is running !");
				}
			}
		};
		
		
		Thread t1 = new Thread(threadObj);
		t1.start();
		
		Thread t2 = new Thread(threadObj2);
		t2.start();
	}

}
