package com.skoti.learning.linkedlist;

import java.util.LinkedList;

public class PushPopPollDemo {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();

		list.add("Jack");
		list.add("Robert");
		list.add("Chaitanya");
		list.add("kate");

		System.out.println(list);

		//Inserts the element at the front of the list.
		list.push("NEW ELEMENT");

		System.out.println(list);
		
		//retrieve element but doesn't remove it
		String peek = list.peek();
		System.out.println("Peeked element is: "+ peek );
		
		String peekFirst = list.peekFirst();
		System.out.println("Peeked first element is: "+ peekFirst );
		
		String peekLast = list.peekLast();
		System.out.println("Peeked last element is: "+ peekLast );

		list.removeAll(list);
		System.out.println("list  size is: "+ list.size());
		
		//poll() method  returns null, If list is empty.
		String poll = list.poll();
		System.out.println("Polled element is " + poll);
		
		//pop() method  throws exception If list is empty.
		String pop = list.pop();
		System.out.println("Popped element is " + pop);

		System.out.println(list);
	}

}
