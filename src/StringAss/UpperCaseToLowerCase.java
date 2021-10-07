package StringAss;

import java.util.Scanner;

public class UpperCaseToLowerCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter character in uppercase:");
		String str=sc.nextLine();
		int temp;
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)((int)ch[i]+32);
			}
		}
		
		System.out.print("String in lower case is:");
		for(int i=0;i<str.length();i++)
		System.out.print(ch[i]);
		
		//by function
//		String strUpper;
//		 String str=ch.toLowerCase();
	}

}
