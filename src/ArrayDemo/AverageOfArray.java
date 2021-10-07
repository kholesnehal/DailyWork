package ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOfArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int size=sc.nextInt();
		
		int a[]=new int[size];
		int sum=0;
		float avg=0;
		System.out.println("Enter the array:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Given array is:");
		System.out.println(Arrays.toString(a));
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			avg=sum/size;
		}
		System.out.println("Sum is:"+sum);
		System.out.println("Average is:"+avg);
	}

}
