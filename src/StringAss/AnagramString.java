package StringAss;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string:");
		String str1=sc.next();
		System.out.println("Enter the second string:");
		String str2=sc.next();
		
//		StringBuffer ss=new StringBuffer(str2);
//		System.out.println(ss.reverse());
//		String s1=ss.toString();
		String a1 = "";
		String b1="";
		char[] a=str1.toLowerCase().toCharArray();
		char[] b=str2.toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		
		
//		for(int i=0;i<a.length;i++)
		
//		{
//			for(int j=i+1;j<a.length;j++)
//			{
//				if(a[i]<a[j])
//				{
//					char temp=a[i];
//					a[i]=a[j];
//					a[j]=temp;
//				}
//			}
//			System.out.println(a1=Arrays.toString(a));
//		}
//		
//		
//		for(int i=0;i<b.length;i++)
//		{
//			for(int j=i+1;j<b.length;j++)
//			{
//				if(b[i]<b[j])
//				{
//					char temp1=b[i];
//					b[i]=b[j];
//					b[j]=temp1;
//				}
//			}
//			System.out.println(b1=Arrays.toString(a));
//		}
		
		boolean anagram=Arrays.equals(a, b);
		if(anagram)
		{
			System.out.println(" String is anagram");
		}
		else
		{
			System.out.println(" String is not anagram");
		}
		
	}

	}

