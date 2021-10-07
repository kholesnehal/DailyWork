package SortingAlgorithm;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {45,9,65,1,0,45,23};
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a.length-1-i;j++)
//			{
//				if(a[j]>a[j+1])
//				{
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
////			System.out.println(Arrays.toString(a));
//		}
//		System.out.println(Arrays.toString(a));
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
//			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}

}
