package com.simplilearn.datastructure.stack;

import java.util.EmptyStackException;

public class ArrayStak {
	
	private Employee[] stack;
	private int top;
	
	//create stack
	public ArrayStak(int capacity) {
		stack = new Employee[capacity];
	}
	// capacity
	public int capacity() {
		return stack.length;
	}
	//size
	public int size() {
		return top;
	}
	//isEmpty 
	public boolean isEmpty() {
		return top ==0;
	}
	
	// push
	public void push(Employee data) {
		// stack is full -> auto grow the size
		if(top==stack.length) {
			// double the size
			Employee[] newArr = new Employee[2*stack.length];
			System.arraycopy(stack, 0, newArr, 0, stack.length);
			stack = newArr;
		}
		// add value in stack
		stack[top++] = data;
		
	}
	
	// pop
	public Employee pop() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		Employee removedNode = stack[--top];
		stack[top] = null;
		return removedNode;
	}
	
	// peek
	public Employee peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		return stack[top-1];
	}
	
	// print stack
	public void printStack() {
		System.out.println("Top => ");
		for (int i = top-1; i >= 0; i--) {
			System.out.println(stack[i]);
		}
	}
	
}
