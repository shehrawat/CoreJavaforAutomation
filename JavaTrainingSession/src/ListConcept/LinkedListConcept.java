package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {

		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test");	//0
		ll.add("QTP");	//1
		ll.add("Selenium");	//2
		ll.add("RPA");	//3
		ll.add("RFT");	//4
		
		System.out.println("Content of linkedlist: "+ll);
		
		//add first:
		ll.addFirst("Ajay"); //now it becomes 0 index
		ll.addLast("Singh"); //now it becomes last index
		
		System.out.println("Content of linkedlist after add first and last: "+ll);
		
		//get:
		System.out.println(ll.get(0));
		System.out.println(ll.get(1));
		System.out.println(ll.get(6));
		
		//set: It take place of 0 index element which is Ajay. Now Ajay will be remove from the list
		ll.set(0, "Automation");
		System.out.println(ll.get(0));
		System.out.println("New Content of linkedlist after add first and last: "+ll);
		
		//remove first and last element:
		ll.removeFirst();	//here it remove the 0 index element which is Automation
		ll.removeLast();	//here it remove the last index element which is Singh
		
		System.out.println("Final list after remove first and last element: "+ll);
		
		ll.remove(2);	//here it remove the 2 index element which is Selenium
		
		System.out.println("Final list after remove: "+ll);
		
		System.out.println(ll.size());
		
		//how to print all the values of LinkedList:
		//for loop
		
		System.out.println("Using for loop:");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		//advance for loop
		System.out.println("Using advance for loop:");
		
		for(String s:ll) {
			System.out.println(s);
		}
		
		//iterator
		System.out.println("Using iterator:");
		Iterator<String> it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());	
		}
		

		//while loop
		System.out.println("Using while loop:");
		int num = 0;
		while(num<ll.size()) {
			System.out.println(ll.get(num));
			num++;
		}
	}

}