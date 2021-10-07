package ArrayDemo;

import java.util.Scanner;

public class SimpleArray {

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
		System.out.println("Reverse array:");
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("Alternate ");
		for(int i=0;i<a.length;i=i+2)
		{

			System.out.println(a[i]);
		}
	}

}
