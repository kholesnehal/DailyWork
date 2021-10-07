package StringAss;

import java.util.Scanner;

public class OccurenceOfAlphabetInGivenString {
	public static void countchar(String str)
	{
         int counter[]=new int[256];
		
		for(int i=0;i<str.length();i++)
			counter[str.charAt(i)]++;
		
		char a[]=new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
//			
			a[i]=str.charAt(i);
			int flag=0;
			for(int j=0;j<=i;j++)
			{
				if(str.charAt(i)==a[j])
					flag++;
			}
			if(flag==1)
				System.out.println("Occurence of char  "+str.charAt(i)+" is:"+counter[str.charAt(i)]);
		}
	}

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the string:");
//		String str=sc.nextLine();
		String str="HelloWorld";
		countchar(str);
		
}
}