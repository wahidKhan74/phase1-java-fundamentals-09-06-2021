package com.simplilearn.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {

	public static void main(String[] args) {
		
		
		try {
			// 1. read file
			FileInputStream file = new FileInputStream("file-db.txt");
			
			// 2. create input object
			ObjectInputStream input = new ObjectInputStream(file);
			
			// 3. method to de-serialized the object.
			Employee employee = (Employee) input.readObject();
			
			System.out.println("Deserialization is completed !");
			System.out.println("Emp Id : "+employee.getId());
			System.out.println("Emp Name : "+employee.getName());
			System.out.println("Emp Dept : "+employee.getDept());
			System.out.println("Emp Salary : "+employee.getSalary());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		

	}

}
