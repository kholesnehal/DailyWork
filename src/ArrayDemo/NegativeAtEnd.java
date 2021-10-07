package ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeAtEnd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int size=sc.nextInt();
		int temp;
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
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
		}
		System.out.println("Sorted array:");
		System.out.println(Arrays.toString(a));
	}

}
