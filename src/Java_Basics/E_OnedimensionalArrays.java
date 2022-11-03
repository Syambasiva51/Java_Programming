package Java_Basics;

public class E_OnedimensionalArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
 * september 18 2:30
 * Array is a collection of elements of same type.
 * 
 */
		//ARRAY ONE_DIMENSIONAL
		int a[] = new int[5];
		a[0]=10;//initialization  
		a[1]=20;  
		a[2]=70;  
		a[3]=40;  
		a[4]=50; 
		
		for(int i=0;i<5;i++)//length is the property of array  
			System.out.println(a[i]);  
		
		//TWO DIMENSIONAL ARRAY
		
		int b [][] = new int[2][3];
		b[0][0]=101;
		b[0][1]=102;
		b[0][2]=103;
		b[1][0]=104;
		b[1][1]=105;
		b[1][2]=106;
		
		for(int i=0;i<2;i++){  
			 for(int j=0;j<3;j++){  
			   System.out.println(b[i][j]+" ");  
			 }  
			 System.out.println("*****************");  
			}  
		
		

	}

}
