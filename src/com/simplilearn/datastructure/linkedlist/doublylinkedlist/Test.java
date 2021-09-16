package com.simplilearn.datastructure.linkedlist.doublylinkedlist;


public class Test {

	public static void main(String[] args) {
		//create employees
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);
		
		//create singly linked list
		DoublylinkedList dList = new DoublylinkedList();
		
		System.out.println("List is empty : "+dList.isEmpty());
		System.out.println("List size : "+dList.getSize());

		dList.addToFront(employee1);
		dList.addToFront(employee2);
		
		dList.addToEnd(employee3);
		dList.addToEnd(employee4);
		dList.addToFront(employee5);
		
		dList.removeFromFront();
		dList.removeFromEnd();
		System.out.println("-----------------------");
		System.out.println("List is empty : "+dList.isEmpty());
		System.out.println("List size : "+dList.getSize());
		System.out.println("-----------------------");
		
		
		dList.printList();
	}

}
