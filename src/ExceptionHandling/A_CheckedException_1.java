package ExceptionHandling;

/*
 * An Exception is an unwanted event that interrupts the normal flow of the program.
 * oct 1st: 4:05
 * 
 * https://beginnersbook.com/2013/04/java-exception-handling/
 * 
 * 4:23 pause
 */
public class A_CheckedException_1 {
	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 =0;
		try {
			int div = num1/num2;
		    System.out.println("Quotient: "+div);
		}catch(ArithmeticException e){
		      System.out.println("Do not enter divisor as zero.");
		      System.out.println("Error Message: "+e);
		    }	
	}
}
