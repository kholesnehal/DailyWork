package StringAss;

import java.util.Scanner;

public class PalindromeOrSpecialWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word to check whether string is palindrome or special word:");
		String str=sc.next();
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
//			System.out.println(rev);
		}
		if(str.equals(rev)==true)
		{
			System.out.println(str+"  is palindrome");
		}
		if(str.charAt(0)==str.charAt(str.length()-1))
		{
			System.out.println(str+"   is special word");
		}
	}

}
