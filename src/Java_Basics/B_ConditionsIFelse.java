package Java_Basics;

public class B_ConditionsIFelse {
	
	public static void main(String[] args) {
		
		int age=20; 
		int number=13;  
		
		//if condition
		if(age>18){  
	        System.out.println("Age is greater than 18");  
	    }  
		
		// if-else condition
		if(number%2==0)
		{  
		 System.out.println("even number");  
		}
		else
		{  
		 System.out.println("odd number");  
		}  
		
		// if-else-if ladder
		
		int marks=65;  
		
	     
	    if(marks<50){  
	        System.out.println("fail");  
	    }  
	    else if(marks>=50 && marks<60){  
	        System.out.println("D grade");  
	    }  
	    else if(marks>=60 && marks<70){  
	        System.out.println("C grade");  
	    }  
	    else if(marks>=70 && marks<80){  
	        System.out.println("B grade");  
	    }  
	    else if(marks>=80 && marks<90){  
	        System.out.println("A grade");  
	    }else if(marks>=90 && marks<100){  
	        System.out.println("A+ grade");  
	    }else{  
	        System.out.println("Invalid!");  
	    }  
	    
	    //nested if-else:
	    
	    int num = 70;
	    if(num > 100)
	    {
	    	System.out.println("value is greater than number");
	    }
	    if(num <100)
	    {
	    	System.out.println("value is lesser than number");
	    }
	    
	    //switch case:
	     int numb=2;
	     switch(numb+1)
	     {
	     case 1:
	    	 System.out.println("case1:"+numb);
	    	 break;
	     case 2:
	    	 System.out.println("case2:"+numb);
	    	 break;
	     case 3:
	    	 System.out.println("case3:"+numb);
	    	 break;
	     case 4:
	    	 System.out.println("case4:"+numb);
	    	 break;
	    default:
	    	System.out.println("default:"+numb);
	     }
	    
		
		
	}

}
