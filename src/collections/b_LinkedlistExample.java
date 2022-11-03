package collections;

import java.util.LinkedList;

public class b_LinkedlistExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrays are used when length is fixed
		// difference is performance 
		// functionality of arraylist and linked list are same when huge number of data we will go linkedlist
		//less data arraylist
		LinkedList<String> Ll= new LinkedList<String>();
		
		Ll.add("india");
		Ll.add("india");
		Ll.add("canada");
		Ll.add("australia");
		Ll.add("england");
		Ll.add("newzland");
		
		System.out.println(Ll.get(0));
		System.out.println(Ll.get(1));
		
	}
}
