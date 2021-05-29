package com.skoti.learning.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		List<Integer> list = new CopyOnWriteArrayList<>();
	//	List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        new WriterThread("Writer thread", list).start();
        new ReaderThread("Reader thread" , list).start();
	}

}


class WriterThread extends Thread{
	
	private List<Integer> list;

	public WriterThread(String name, List<Integer> list) {
		this.list = list;
		super.setName(name);
	}
	
	public void run() {
		int count = 6;
		while(true) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			list.add(count++);
			System.out.println(super.getName() + " done");
		}
	}
}

class ReaderThread extends Thread{

	private List<Integer> list;
	
	public ReaderThread(String name, List<Integer> list) {
		this.list = list;
		super.setName(name);
	}
	
	public void run() {
		String output = "\n" + super.getName() + ":";
		while(true) {
			
			for(Integer num : list) {
				output += " " + num;
			}
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(output);
		}
		
	}
	
}