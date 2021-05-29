package com.skoti.learning.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListIterator {

	public static void main(String[] args) {

		LinkedList<String> linkedlist = new LinkedList<String>();
		 
	    linkedlist.add("Delhi");
	    linkedlist.add("Agra");
	    linkedlist.add("Mysore");
	    linkedlist.add("Chennai");
	    linkedlist.add("Pune");
	    
	    ListIterator<String> itr = linkedlist.listIterator();
	 // Iterating the list in forward direction
	    while(itr.hasNext()) {
	    	System.out.print(itr.next() + " ");
	    }
	    
	    System.out.println();
	    System.out.println("==========Using hasPrevious()==================");
	 // Iterating the list in backward direction
	    while(itr.hasPrevious()) {
	    	System.out.print(itr.previous() + " ");
	    }
	    
	    
	    System.out.println();
	    System.out.println("=========Reverse order using descending iterator===================");
	    //Iterate a LinkedList in reverse sequential order 
	    Iterator<String> descendingIterator = linkedlist.descendingIterator();
	    while(descendingIterator.hasNext()) {
	    	System.out.print(descendingIterator.next() + " ");
	    }
	}

}
