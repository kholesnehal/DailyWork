package StringAss;

import java.util.Scanner;

public class RevereseTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		String[] ss=str.split(" ");
		for(int i=0;i<ss.length;i++)
		{
			
			String reverse="";
		for(int j=ss[i].length()-1;j>=0;j--)
		{
			reverse=reverse+ss[i].charAt(j);
		}
		System.out.print(reverse+" ");
	}
	}

}
