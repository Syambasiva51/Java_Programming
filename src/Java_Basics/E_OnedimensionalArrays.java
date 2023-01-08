package Java_Basics;

public class E_OnedimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 * array:to store similar data type values in a array variable.
 * september 18 2:30
 * Array is a collection of elements of same type.
 * 
 * Disadvantages: 
 * 1.size is fixed static array  --> to overcome we use collections --Arraylist,Hashtable --use dynamic array
 * 2.similar only similar data types --> to over come this problem we use Object array
 */
		//ARRAY ONE_DIMENSIONAL
		
		//1.int array
		int a[] = new int[5];
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50; 
		
		for(int i=0;i<5;i++)//length is the property of array  
			System.out.println(a[i]);  
		
		//2.double array
		double d[] = new double[5];
		d[0]=10.25;//initialization  
		d[1]=20.34;  
		d[2]=70.34;  
		d[3]=40.12;  
		d[4]=50.89; 
		
		//3.char Array
		char c[] = new char[5];
		c[0]='s';//initialization  
		c[1]=2;  
		c[2]='t';  
		c[3]='d';  
		c[4]='a'; 
		
		//4.boolean Array
		boolean b1[] = new boolean[5];
		b1[0]=true;//initialization  
		b1[1]=false;  
		
		//5.string Array
		String s[] = new String[3];
		s[0]="siva";//initialization  
		s[1]="samba";
		s[2]="dinesh";

	
//Object Array:(Object is a class ) -- is used to store different data type values.
		
		Object ob[] = new Object[5];
		ob[0]=100;
		ob[1]=101.23;
		ob[2]="c";
		ob[3]=true;
		ob[4]="india";
		System.out.println(ob[4]); 
		

		
//TWO DIMENSIONAL ARRAY		
		int b [][] = new int[2][3];
		System.out.println(b.length); //gives total number of rows
		System.out.println(b[0].length);
		b[0][0]=101;
		b[0][1]=102;
		b[0][2]=103;
		
		b[1][0]=104;
		b[1][1]=105;
		b[1][2]=106;
		
		
		for(int i=0;i<b.length;i++){  
			 for(int j=0;j<b[0].length;j++){  
			   System.out.println(b[i][j]+" ");  
			 }  
			 System.out.println("*****************");  
			}  
		
		

	}

}
