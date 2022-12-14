package Java_Basics;

public class D_Loops {
	public static void main(String[] args) {
		
		//Loops: same action multiple times 
		
		//1.for loop
		/*1.Initialization
		 * 2.Condition
		 * 3.Increment/Decrement:
		 * 4.Statement
		 * eg: syntax
		 * for(initialization; condition; increment/decrement){    
				//statement or code to be executed    
				}    
		 * 
		 */
		
//Increment For Loop	
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			System.out.println("Increment");
			}
System.out.println("**************************************************************");
//Decrement For Loop		
		for(int i =10;i>0;i--)
		{
			System.out.println(i);
			System.out.println("decrement");
		}	
System.out.println("**************************************************************");
//NESTED FOR LOOP:
		 
		for(int i=1;i<=3;i++)
			{  
				for(int j=1;j<=3;j++)
					{  
					System.out.println(i+" "+j);  
					} 
			}	

System.out.println("**************************************************************");		
//Infinite LOOP
		/*for(int i=1;i>=1;i++)
		{
			System.out.println(i);
		}
		*/

//Iterate Array using For loop
		int arr [] = {10,20,30,78};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("value of array"+arr[i]);
		}

System.out.println("**************************************************************");
//Enhanced For Loop: 
//Enhanced for loop is another way of defining a loop. 
//This is especially useful when you want to iterate array, ArrayList and other collections classes.	
		 int arr1[]={2,11,45,9};
	      for (int num : arr1) {
	         System.out.println(num);
	      }

System.out.println("**************************************************************");		
//While loop:
	      //disadvantage with while loop:
	      //if you don't provide increment or decremental in while loop it will run for infinite times.
	      int z=0;//initilization
	      while(z<=10) //conditional part
	      {
	    	  System.out.println("while loop"+z);
	    	  z=z+1;//incremental or decremental part
	      }
		
		
	}
}
