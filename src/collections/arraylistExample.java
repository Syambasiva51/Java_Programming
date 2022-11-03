package collections;
/*
 * sep 25th :1:50min
 * 
 */
import java.util.ArrayList;

public class arraylistExample {
	
	public static void main(String[] args) {
		
	//The ArrayList class implements the List interface
	//It uses a dynamic array to store the duplicate element of different data types.
	//The ArrayList class maintains the insertion order and is non-synchronized. 
		ArrayList<String> al = new ArrayList<String>();
		
		al.add("tosca");
		al.add("selenium");
		al.add("Autonomiq");
		al.add("uft");
		al.add("qtp");
		
		System.out.println(al.get(0));
		System.out.println("length"+al.size());
		
		for (int a =0; a<5;a++)
		{
			System.out.println(al.get(a));
		}
	
	}
}
