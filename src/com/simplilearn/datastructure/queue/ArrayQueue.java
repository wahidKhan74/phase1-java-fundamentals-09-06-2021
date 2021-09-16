package com.simplilearn.datastructure.queue;


public class ArrayQueue {

	private Employee[] queue;
	private int front;
	private int rear;

	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}

	// size
	public int size() {
		return rear - front;
	}

	// capacity
	public int capacity() {
		return queue.length;
	}

	// add => add element
	public void add(Employee data) {
		// queue is full
		if (rear == queue.length) {
			// double the size
			Employee[] newArr = new Employee[2 * queue.length];
			System.arraycopy(queue, 0, newArr, 0, queue.length);
			queue = newArr;
		}
		//add value in queue
		queue[rear++] = data;
	}
	
	// remove => remove element
	public Employee remove() {
		// verify that queue is empty
		if(size()==0) {
			rear =0;
			front=0;
			return null;
		}
		Employee removedElm = queue[front];
		queue[front] = null;
		front++;
		return removedElm;
	}

	//peek 
	public Employee peek() {
		if(size()==0) {
			rear =0;
			front=0;
			return null;
		}
		return queue[front];
	}

	//print 
	public void printQueue() {
		System.out.println("Front => ");
		for (int i = front; i < rear; i++) {
			System.out.println(queue[i]);
		}
		System.out.println("<= Rear");
	}
}












