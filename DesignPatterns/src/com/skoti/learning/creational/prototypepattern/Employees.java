package com.skoti.learning.creational.prototypepattern;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List<String> empList;
	
	public Employees() {
		this.empList = new ArrayList<>();
	}
	
	public Employees(List<String> empList) {
		this.empList = empList;
	}
	
	public void loadDataFromDatabase() {
		empList.add("Shashi");
		empList.add("Shwetha");
		empList.add("VedAryan");
	}
	
	public List<String> getEmpList() {
		return empList;
	}
	
	@Override
	public Object clone() {
		List<String> tempList = new ArrayList<>();
		for(String s : this.getEmpList()) {
			tempList.add(s);
		}
		return new Employees(tempList);
	}

	@Override
	public String toString() {
		return "Employees [empList=" + empList + "]";
	}
	
}
