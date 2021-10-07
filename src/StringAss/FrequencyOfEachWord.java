package StringAss;

import java.util.Scanner;

public class FrequencyOfEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		str=str+"";
		int str1=0;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				String word=str.substring(str1,i);
				System.out.println(word+" = "+word.length());
				str1=i+1;
			}
		}
	}

}
