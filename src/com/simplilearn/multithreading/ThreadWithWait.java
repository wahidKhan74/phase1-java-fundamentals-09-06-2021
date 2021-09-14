package com.simplilearn.multithreading;

class Customer {

	double balance = 1000.0;

	// deposit operation
	synchronized void deposit(double amount) {
		System.out.println("Going to deposit...");
		balance += amount;
		System.out.println("----------------");
		System.out.println("Desposit is complted ! & new balance is: " + balance);
		// resume blocking thread
		notifyAll();
	}

	// withdraw operation
	synchronized void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient funds!");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		balance -= amount;
		System.out.println("----------------");
		System.out.println("Withdraw is completed ! & new balance is : " + balance);
		// System.out.println("Thread Id : " + Thread.currentThread().getId());
	}

	// show balance
	synchronized void showBalance() {
		System.out.println("----------------");
		System.out.println("The account balance : " + balance);
	}
}

public class ThreadWithWait {

	public static void main(String[] args) {
		// create custmer obj
		Customer customer = new Customer();

		// create threads
		Thread t1 = new Thread(() -> {
			customer.withdraw(3000);
		});

		Thread t2 = new Thread(() -> {
			customer.deposit(5000);
		});

		Thread t3 = new Thread(() -> {
			customer.showBalance();
		});

		t1.start();
		t2.start();
		t3.start();
	}

}
