package collections;

/*
 * sep 25: startTime 3:10
 * https://beginnersbook.com/2013/12/hashmap-in-java-with-example/
 * 
 */
import java.util.HashMap;
import java.util.Map;

public class d_hashmapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		
		hm.put("thilak", 100);
		hm.put("dinesh", 95);
		hm.put("banu", 90);
		hm.put("sai", 99);
		
		System.out.println(hm.size());
		System.out.println(hm.get("thilak"));
		
		for(Map.Entry str :hm.entrySet()) {
			System.out.println(str.getKey()+" "+str.getValue());
		}
		
		
	}

}
