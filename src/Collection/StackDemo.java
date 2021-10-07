package Collection;

import java.util.Iterator;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer>s=new Stack<>();
		s.push(67);
		s.push(45);
		s.push(14);
		s.push(90);
		s.push(55);
		
		//way 1
		System.out.println(s);
		
		//using iterator
		System.out.println("Using iterator");
		Iterator<Integer>itr=s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Using for each
		System.out.println("Using for each");
		for(Integer i:s)
		{
			System.out.println(i);
		}
		
		//Using traditional for loop
		for(int i=0;i<s.size();i++)
		{
			System.out.println(s);
		}
		
	}

}
