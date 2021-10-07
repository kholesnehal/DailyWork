package ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertAtSpecifiedPosition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		System.out.println("Enter the array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given array is:");
		
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
		System.out.println("Enter position to insert element:");
		int pos=sc.nextInt();
		System.out.println("Enter element to insert:");
		int element=sc.nextInt();
	   

	  System.out.println(Arrays.toString(a));     
	   
	  for(int i=a.length-1; i >pos; i--)
	  {
	    a[i] =a[i-1];
	   }
	   a[pos] =element;
	   System.out.println("New Array: "+Arrays.toString(a));
	}

}
