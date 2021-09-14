package com.simplilearn.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		Employee employee = new Employee(1000001, "John Smith", "Engineering", 4556543.43);
		
		// convert object into byte stream.
		// byte stream -> save data into file
		try {
			// create file output stream
			FileOutputStream file = new FileOutputStream("file-db.txt");
			
			//create a object stream
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			// method to serialized object
			out.writeObject(employee);
			
			System.out.println("Serialization / Write operation is completed !");
			//clean up
			out.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
