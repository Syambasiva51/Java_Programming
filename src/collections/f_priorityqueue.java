package collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class f_priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 PriorityQueue<String> pq1=new PriorityQueue<String>();
		 pq1.add("Test 1");
		 pq1.add("Test 2");
		 pq1.add("Test 3");
		 pq1.add("Test 4");
		 pq1.add("Test 5");
		    	 
		 System.out.println("Result of Priority Queue "+pq1);

		 ArrayDeque<String> ad1=new ArrayDeque<String>();

		 ad1.add("Selenium 1");
		 ad1.add("Selenium 2");
		 ad1.add("Selenium 3");
		 ad1.add("Selenium 4");
		 ad1.add("Selenium 5");

		 ad1.addFirst("New");
		 ad1.addLast("Last element");


		 System.out.println("Result of ArrayDeque "+ad1);



	}

}
