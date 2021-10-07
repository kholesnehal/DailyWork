package ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class SeparateZero {

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
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				System.out.print(a[i]+" ");
			}

		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
