package com.simplilearn.datastructure.linkedlist.circularlinkedlist;

public class CircularLinkedList {
	
	private Node head;
	private Node tail;
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
		//verify linked list is empty
		if(isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
		}
		// append
		tail = node;
		tail.setNext(head);
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
		// tail next reference to new head for circular linked list
		tail.setNext(head);
		return removednode;
		
	}
	// print list
	public void printList() {
		Node curent = head;
		if(curent== null) {
			System.out.println("Circular linked list is empty !");
		} else {
			System.out.println("Head => ");
			do  {
				if(curent != null) {
					System.out.println(curent.getData());
					System.out.println("=>");
					curent = curent.getNext();
				}
			} while(curent != head);
		}
	}
}
