package com.skoti.learning.arraylist;

public class StudentListComparable implements Comparable<StudentListComparable> {

	private int rollNum;
	private String studName;
	private int studAge;
	
	public StudentListComparable(int rollNum, String studName, int studAge) {
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

	@Override
	public int compareTo(StudentListComparable stud) {
		String studNameInComp = stud.getStudName();
	//	return this.studName.compareTo(studNameInComp);  //Ascending order
		return studNameInComp.compareTo(this.studName);  //Descending order
	}
	
}
