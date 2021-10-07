package StringAss;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		
		String str1=new String("HelloWorld");
		String str2=new String("helloworld");
		
		System.out.println("indexOf given character: "+str1.indexOf('l'));
		
		System.out.println("index of given string:"+str1.indexOf("Wor"));
		
		//compare to
		
		if(str1.compareTo(str2)==0)
			System.out.println("Strings are equal");
		
		else if(str1.compareTo(str2)<0)
			System.out.println("Str1 is less than str2");
		else if(str1.compareTo(str2)>0)
			System.out.println("str1 is greater than str2");
		
		
		
		//subString
		System.out.println("substring:"+str1.substring(2,6));
		
		//substring
//		System.out.println("substring():"+str1.substring(4, 11));
		
		//last index
		System.out.println("last index of:"+str1.lastIndexOf('l'));
		
		//start with return true or false
		
		System.out.println("Startwith():"+str1.startsWith("Hel"));
		
		//endswith return true or false
		System.out.println("Endswith():"+str1.endsWith("ld"));
		
		//uppercase
		System.out.println("Uppercase:"+str2.toUpperCase());
		
		//lowercase
		System.out.println("Lowercase:"+str2.toLowerCase());
		
		//replace
		System.out.println("Replace string:"+str2.replace('l', 'h'));
		
		//length()
		System.out.println("Length():"+str2.length());
		
		//charAt
		System.out.println("charAt():"+str2.charAt(6));
		
		//compareTo
		System.out.println("comapareTo:"+str2.compareTo(str1));
		
		//contain returns true or false
		System.out.println("contain():"+str2.contains(str2));
		
		//intern
		System.out.println("intern():"+str2.intern());
		
		//split
		String sk="java is programming language";
		String ss[]=sk.split(" ");
		System.out.println("Split"+Arrays.toString(ss));
		
		
	}

}
