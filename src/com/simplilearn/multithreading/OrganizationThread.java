package com.simplilearn.multithreading;

public class OrganizationThread {

	public static void main(String[] args) {

		// create a new thread john
		John t1 = new John();
		t1.start();

		// create a new thread john
		Ava t2 = new Ava();
		t2.start();
		
		// create a new thread john
		Mike t3 = new Mike();
		t3.start();
	}

} // OrganizationThread

class Task {
	
	void updateWork(){
		System.out.println("Update work action");
	}
	
}

class John extends Thread {

	@Override
	public void run() {
		System.out.println("John Thread is ruuning !");
	}
}

class Mike extends Thread {

	@Override
	public void run() {
		System.out.println("Mike Thread is ruuning !");
	}
}

class Ava extends Thread {

	@Override
	public void run() {
		System.out.println("Ava Thread is ruuning !");
	}
}
