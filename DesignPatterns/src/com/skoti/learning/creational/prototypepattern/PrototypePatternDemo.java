package com.skoti.learning.creational.prototypepattern;

import java.util.List;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		Employees emps = new Employees();
		emps.loadDataFromDatabase();
		
		Employees newClonedEmp1 = (Employees)emps.clone();  //cloned object
		List<String> newempList1 = newClonedEmp1.getEmpList();
		newempList1.add("Naala");
		System.out.println(newempList1);
	}

}
