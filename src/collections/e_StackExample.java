package collections;
/*
 * 
 * OCT 1st ;- 3:50
 * https://beginnersbook.com/java-collections-tutorials/
 */
import java.util.Stack;

public class e_StackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		stack.push("Chaitanya"); //["Chaitanya"]
	    stack.push("Ajeet"); //["Chaitanya", Ajeet]
	    stack.push("Hari"); //["Chaitanya", "Ajeet", "Hari"]
	    stack.pop(); //removes the last element
	    stack.push("Steve"); //["Chaitanya", "Ajeet", "Steve"]
	    stack.push("Carl"); //["Chaitanya", "Ajeet", "Steve", "Carl"]
	    stack.pop(); //removes the last element
	    
	    System.out.println("Stack elements: ");
	    for(String str: stack){
	      System.out.println(str);
	    }

	}

}
