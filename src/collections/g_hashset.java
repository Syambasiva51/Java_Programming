package collections;

import java.util.HashSet;
import java.util.Iterator;

/*HashSet allows only unique elements. 
 * It doesn’t maintain the insertion order which means element 
 * inserted last can appear at first when traversing the HashSet.
 * 
 * https://beginnersbook.com/java-collections-tutorials/
 */
public class g_hashset {
	
//using constructor and this key word example
//this : ‘this’ is a reference variable that refers to the current object.
	//reference link:https://www.geeksforgeeks.org/this-reference-in-java/

int studentid;
String Studentname;
int studentnumber;
	public g_hashset(int studentid,String Studentname,int studentnumber )
	{
		this.studentid=studentid;
		this.Studentname=Studentname;
		this.studentnumber=studentnumber;
		
	}
	
	void display()
    {
       
        System.out.println("studentid = " + studentid + "  Studentname = " + Studentname + "  studentnumber ="+studentnumber);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		g_hashset hs = new g_hashset(100, "siva", 123456);
		hs.display();
		
		
		
		HashSet <g_hashset> Hs1 = new HashSet();
		
		g_hashset a1 = new g_hashset(100, "siva", 12345);
		g_hashset a2 = new g_hashset(101, "thilak", 67890);
		g_hashset a3 = new g_hashset(102, "bharathi", 9865432);
		
		Hs1.add(a1);
		Hs1.add(a2);
		Hs1.add(a3);
		
		System.out.println(Hs1);
		for(g_hashset abc : Hs1)
		{
	        System.out.println("studentid = " + abc.studentid + "  Studentname = " + abc.Studentname + "  studentnumber ="+ abc.studentnumber);
		}
		
		
		HashSet <String> Hs = new HashSet();
		
		Hs.add("samba");
		Hs.add("uma");
		Hs.add("seshu");
		Hs.add("balu");
		
		System.out.println(Hs);
		
		Iterator<String> It = Hs.iterator();
		
		while(It.hasNext())
		{
			System.out.println(It.next());
		}
		
	}
}
