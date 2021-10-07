package StringAss;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		String ss=str.trim();
		System.out.println(ss);
		String str1=str.replaceAll("\\s", "");
		System.out.println(str1);
		
	}

}
