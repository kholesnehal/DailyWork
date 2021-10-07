package StringAss;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfWordsInString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		int count=0;
		String[] ss=str.split(" ");
		for(int i=0;i<ss.length;i++)
		{
//			String ss[]=str.split("");
//			System.out.println("Split"+Arrays.toString(ss));
			count++;
			System.out.print(ss[i]);
		}
		System.out.println("\nNo of words in string:"+count);
	}

}
