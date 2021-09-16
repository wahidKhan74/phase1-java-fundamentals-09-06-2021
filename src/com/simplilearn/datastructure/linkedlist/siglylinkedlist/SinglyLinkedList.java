package com.simplilearn.datastructure.linkedlist.siglylinkedlist;

public class SinglyLinkedList {
	
	private Node head;
	private int size;
	
    // linked operations
	// size
	public int getSize() {
		return size;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	// add element
	public void add(Employee data) {
		// create a node
		Node node = new Node(data);
		//set next node value
		node.setNext(head);
		// set head as new node
		head = node;
		size++;
	}
	
	// remove element
	public Node remove() {
		// verify linked empty 
		if(isEmpty()) {
			return null;
		}
		// set  removed node
		Node removednode = head;
		// set next node in the list as head
		head = head.getNext();
		size --;
		// nullify the moved  node
		removednode.setNext(null);
		return removednode;
		
	}
	// print list
	public void printList() {
		Node curent = head;
		System.out.println("Head => ");
		while(curent != null) {
			System.out.println(curent.getData());
			System.out.println("=>");
			curent = curent.getNext();
		}
		System.out.println("Null");
	}
}
