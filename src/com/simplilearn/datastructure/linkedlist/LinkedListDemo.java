package com.simplilearn.datastructure.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);
		
		// create a linked list
		LinkedList<Employee> empList = new LinkedList<Employee>();
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		
		empList.addFirst(employee5); // head
		empList.addLast(employee4);  // tail

		for(Employee emp : empList) {
			System.out.println(emp);
		}
		
	}

}
