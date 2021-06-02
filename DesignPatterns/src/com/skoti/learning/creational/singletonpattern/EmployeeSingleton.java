package com.skoti.learning.creational.singletonpattern;

import java.io.Serializable;

public class EmployeeSingleton implements Serializable {

	private static final long serialVersionUID = 1L;

	private static volatile EmployeeSingleton empSingleton = null;

	private int i = 10;

	private EmployeeSingleton() {

	}

	public static EmployeeSingleton getInstance() {
		if (empSingleton == null) {
			synchronized (EmployeeSingleton.class) {
				if (empSingleton == null) {
					empSingleton = new EmployeeSingleton();
				}
			}
		}
		return empSingleton;
	}

	protected Object readResolve() {
		return empSingleton;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}
}
