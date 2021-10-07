package ArrayDemo;

import java.util.Arrays;
import java.util.Scanner;

public class SearchGivenNo {

	public static void main(String[] args) {
		int a[] = {1,5,7,9,3,6};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number to search:");
		int search=sc.nextInt();
		int found=0;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				found=1;
			System.out.println("element found at position:"+i);
		}
		}
		if(found==0)
			System.out.println("element not found");
		
//		 int temp = -9;
		 
		 // for - 0 ..len
		 // if(temp == a[i])
		 // a[i] found
		 // break;
		
//		for(int i=a.length-1;i>=0;i--)
//		{
//			System.out.println(a[i]);
//		}
//		System.out.println(Arrays.toString(a));
//		int count=0;
//		int count1=0;
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2==0)
//			{
//				count++;
//			}
//			else if(a[i]%2!=0)
//			{
//				count1++;
//			}
//		}
//		System.out.println("count:"+count);
//		System.out.println("count1:"+count1);
//		
	}

}
