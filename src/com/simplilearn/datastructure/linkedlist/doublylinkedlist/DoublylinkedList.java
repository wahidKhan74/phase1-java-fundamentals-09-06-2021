package com.simplilearn.datastructure.linkedlist.doublylinkedlist;


public class DoublylinkedList {

	private Node head;
	private Node tail;
	private int size;

	// size
	public int getSize() {
		return size;
	}

	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}

	// addToFront
	public void addToFront(Employee data) {
		// create a node
		Node node = new Node(data);
		// if list empty then new node will be head & tail
		if (isEmpty()) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}
		// new node is head
		head = node;
		size++;
	}

	// addToEnd
	public void addToEnd(Employee data) {
		// create new node
		Node node = new Node(data);
		// if list empty then new node will be head & tail
		if (isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		// new node is tail
		tail = node;
		size++;
	}

	// removeFromFront
	public Node removeFromFront() {
		if (isEmpty()) {
			return null;
		}
		Node removedNode = head;
		// next node as head
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		// next node as head
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	// removeFromEnd
	public Node removeFromEnd() {
		if (isEmpty()) {
			return null;
		}
		Node removedNode = tail;
		// next node as head
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		// next node as head
		tail = tail.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	// print list
	public void printList() {
		Node curent = head;
		System.out.println("Head => ");
		while (curent != null) {
			System.out.println(curent.getData());
			System.out.println("< = >");
			curent = curent.getNext();
		}
		System.out.println("<= Tail");
	}

}
