package com.skoti.learning.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedArrayList {

	public static void main(String[] args) {

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				callList();
			}
		});

		Thread t2 = new Thread(new Runnable() {
			public void run() {
				callList();
			}
		});

		t1.setName("Thread-1");
		t2.setName("Thread-2");
		t1.start();
		t2.start();
	}

	static void callList() {
		List<String> synchronizedList = Collections.synchronizedList(new ArrayList<>());

		synchronizedList.add("Pen");
		synchronizedList.add("NoteBook");
		synchronizedList.add("Ink");

		// iterator should be in synchronized block in this type of synchronization
		synchronized (synchronizedList) {
			Iterator<String> itr = synchronizedList.iterator();
			System.out.println(Thread.currentThread().getName() + " is adding elements to list");
			while (itr.hasNext()) {
				// if(itr.next()=="Ink")
				// synchronizedList.remove(2); //this will throw ConcurrentModificationException
				// itr.next();
			}
		}
		System.out.println(synchronizedList);
	}

}
