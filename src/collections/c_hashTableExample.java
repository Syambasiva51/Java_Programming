package collections;

import java.util.Hashtable;
import java.util.Map;

public class c_hashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//store the values in key value pair
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		ht.put(100, "one hundred");
		ht.put(200, "two hundred");
		ht.put(300, "three hundred");
		ht.put(400, "four hundred");
		ht.put(500, "five hundred");
		
		System.out.println(ht.size());
		
		System.out.println(ht.get(200));
		System.out.println(ht.get(300));
	
		

	}

}
