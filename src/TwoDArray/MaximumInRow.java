package TwoDArray;

import java.util.Scanner;

public class MaximumInRow {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int r=sc.nextInt();
		System.out.println("Enter number of col:");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter array elements:");
		//		int a[][]=new int[r][c];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		int max1=a[1][0];
		for(int i=0;i<a.length;i++)
		{
			int max=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(a[i][j]>max)
					max=a[i][j];
				
			}
			System.out.println("Maximum of row:"+max);
		}
		
	
	}

}
