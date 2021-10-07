package ArrayDemo;

import java.util.Scanner;

public class PrintAndCountNegative {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int size=sc.nextInt();
		int count=0;
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
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<0)
			{
				count++;
				System.out.println("Negative elements:"+a[i]);
			}
		}
		System.out.println("Count:"+count);
	}

}
