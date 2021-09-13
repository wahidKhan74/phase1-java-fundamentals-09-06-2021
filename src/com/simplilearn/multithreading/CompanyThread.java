package com.simplilearn.multithreading;

public class CompanyThread {

	public static void main(String[] args) {
		
		Bob bob = new Bob();
		Thread t1 = new Thread(bob);
		t1.start();
		
		
		Syed syed = new Syed();
		Thread t2 = new Thread(syed);
		t2.start();

	}

}

class Work {
	
	void updateWork(){
		System.out.println("Update work action");
	}
	
}


class Bob extends Work implements Runnable {

	@Override
	public void run() {
		System.out.println("The thread Bob is ruuning !");
		
	}
	
}


class Syed implements Runnable {

	@Override
	public void run() {
		System.out.println("The thread Syed is ruuning !");
		
	}
	
}