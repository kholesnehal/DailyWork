package TwoDArray;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int r=sc.nextInt();
		System.out.println("Enter number of col:");
		int c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Length of array:"+a.length);
		System.out.println("Enter array elements:");
		//		int a[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[c][r];
//		System.out.println("Matrix:");
//		for(int i=0;i<a.length;i++)
//		{
//			for(int j=0;j<a[i].length;j++)
//			{
//				System.out.print(a[i][j]+" ");
//			}
//			System.out.println();
//		}
		System.out.println("Transpose array:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
			}
			System.out.println();
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]+" ");
			}
			System.out.println();
		}
	}

}
