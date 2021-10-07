package StringAss;

import java.util.Scanner;

public class CalculateNoOfCharacterInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		char[] a=str.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			count++;
			System.out.print(a[i]);
		}
		System.out.println("\nNo of character in string:"+count);
	}

}
