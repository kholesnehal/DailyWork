package StringAss;

import java.util.Scanner;

public class ValidationOfPassword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name:");
		String uname=sc.nextLine();
		System.out.println("Eneter password:");
		String password=sc.next();
		String ss[]=password.split("");
//		char ch=password.charAt(i);
			if(password.length()<8);
			{
				System.out.println("Password must be 8 chars long");
			}
			for(int i=0;i<password.length();i++)
			{
				char ch=password.charAt(i);
				if(password!="#" && password!="@")
			{
				System.out.println("At least one special @ or # character must be present");
			}
			if((ch>='0'&& ch<='9')||(ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
			{
				System.out.println("Password must contain at least one digit");
			}
			if(ss[i].charAt(i)==' ')
			{
				System.out.println("Password must not contain space");
			}
			
		}
	}

}
