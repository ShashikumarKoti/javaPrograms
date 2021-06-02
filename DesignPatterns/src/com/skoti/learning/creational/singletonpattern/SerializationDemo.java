package com.skoti.learning.creational.singletonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	static EmployeeSingleton emp = EmployeeSingleton.getInstance();

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Serialize
		FileOutputStream fos = new FileOutputStream("testSingleton.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();

		emp.setI(20);

		// De-serialize
		FileInputStream fis = new FileInputStream("testSingleton.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		EmployeeSingleton deserializedEmp = (EmployeeSingleton) ois.readObject();
		ois.close();

		System.out.println(emp.getI() + " and hashcode is " + emp.hashCode());
		System.out.println(deserializedEmp.getI() + " and hashcode is " + deserializedEmp.hashCode());
	}
}
