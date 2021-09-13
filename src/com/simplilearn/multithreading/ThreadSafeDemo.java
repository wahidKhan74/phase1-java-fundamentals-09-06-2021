package com.simplilearn.multithreading;

class Counter {

	int count = 0;

	// increase count
	public synchronized void increaseCount() {
		count++;  // count=count+1;  or count+=1;
	}

	// decrease count
	public void deccreaseCount() {
		count--; // count=count-1;  or count-=1;
	}

}

public class ThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		//create counter obj
		Counter counter = new Counter();
		
		Thread t1 = new Thread(()-> {
			for (int index = 0; index < 1000; index++) {
				counter.increaseCount();
			}
		});
		
		Thread t2 = new Thread(()-> {
			for (int index = 0; index < 1000; index++) {
				counter.increaseCount();
			}
		});
		
		Thread t3 = new Thread(()-> {
			for (int index = 0; index < 1000; index++) {
				counter.increaseCount();
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		System.out.println("The Count : "+counter.count);

	}

}
