package ArrayDemo;

import java.util.Scanner;

public class MinMaxArray {

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
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(min>a[i])
				min=a[i];
		}
		System.out.println("Minimun of array is:"+min);
		
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
				max=a[i];
		}
		System.out.println("Maximum of array is:"+max);
	}

}
