package collections;
import java.util.Iterator;
/*
 * 
 * 
 * 
 */
import java.util.LinkedHashSet;

public class H_LinkedHasSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<String> LH = new LinkedHashSet();
		
		LH.add("test1");
		LH.add("test2");
		LH.add("test3");
		LH.add("test4");
		
		System.out.println(LH);
		
		Iterator<String> IT = LH.iterator();
		
		while(IT.hasNext())
		{
			System.out.println(IT.next());
		}

	}

}
