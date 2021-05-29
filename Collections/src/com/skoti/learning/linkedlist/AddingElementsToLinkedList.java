package com.skoti.learning.linkedlist;

import java.util.LinkedList;

public class AddingElementsToLinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedlist = new LinkedList<String>();
		 
		linkedlist.add("EE");
	    linkedlist.add("AA");
	    linkedlist.add("BB");
	    linkedlist.add("CC");
	    linkedlist.add("DD");
	    linkedlist.add("BB");
	    linkedlist.add("EE");
	    
	    System.out.println(linkedlist);
	    
	    linkedlist.addFirst("FirstElement");
	    linkedlist.add("FF");
	    linkedlist.addLast("Last element");
	    
	    linkedlist.offerFirst("Offered element");
	    linkedlist.offer("offer");
	    
	    linkedlist.removeFirst();
	    linkedlist.removeLast();
	    linkedlist.removeFirstOccurrence("BB");
	    linkedlist.removeLastOccurrence("EE");
	    
	    System.out.println(linkedlist);
	}

}
