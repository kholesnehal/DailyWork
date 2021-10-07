package ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddInSeparateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int size=sc.nextInt();
		int count=0;
		int a[]=new int[size];
		int b[]=new int[a.length];
		int c[]=new int[a.length];
		int even=0;
		int odd=0;
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
		for(int i=0;i<a.length;i++ )
		{
			if(a[i]%2==0)
			{
				b[even]=a[i];
				even++;
			}
			else
			{
				c[odd]=a[i];
				odd++;
			}
		}
		System.out.println(Arrays.toString(b));
		System.out.println(Arrays.toString(c));
	}

}
