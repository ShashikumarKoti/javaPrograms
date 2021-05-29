package com.skoti.learning.arraylist;

import java.util.Comparator;

public class StudentListComparator {

	private int rollNum;
	private String studName;
	private int studAge;
	
	public StudentListComparator(int rollNum, String studName, int studAge) {
		super();
		this.rollNum = rollNum;
		this.studName = studName;
		this.studAge = studAge;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getStudAge() {
		return studAge;
	}

	public void setStudAge(int studAge) {
		this.studAge = studAge;
	}
	
	@Override
	public String toString() {
		return "StudentList [rollNum=" + rollNum + ", studName=" + studName + ", studAge=" + studAge + "]";
	}
}


class StudNameComparator implements Comparator<StudentListComparator> {

	@Override
	public int compare(StudentListComparator stud1, StudentListComparator stud2) {
		String studName1 = stud1.getStudName();
		String studName2 = stud2.getStudName();
		return studName1.compareTo(studName2);
	}
	
}

class StudAgeComparator implements Comparator<StudentListComparator> {

	@Override
	public int compare(StudentListComparator stud1, StudentListComparator stud2) {
		Integer studAge1 = stud1.getStudAge();
		Integer studAge2 = stud2.getStudAge();
		if(studAge1==studAge2) {
			return stud1.getStudName().compareTo(stud2.getStudName());  //If age is same then compare by stud Name
		}
		return studAge1.compareTo(studAge2);
	}
	
}