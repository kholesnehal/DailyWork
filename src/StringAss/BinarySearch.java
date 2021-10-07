package StringAss;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		int a[]= {5,9,4,2,7,0};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter element to search:");
		int search=sc.nextInt();
		int found=0;
		for(int i=0;i<a.length;i++)
		{
			if (search==a[i])
			{
				found=1;
				System.out.println("element present at postion:"+i);
			}
		}
		if(found==0)
			System.out.println("element not present");
	}

}
