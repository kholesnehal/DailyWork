package Collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CheckNoIsPresentOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashSet<Integer>hm=new HashSet<>();
		hm.add(56);
		hm.add(34);
		hm.add(24);
		hm.add(98);
		hm.add(67);
		System.out.println(hm);
		System.out.println("Enter number :");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=0;i<hm.size();i++)
		{
			if(hm.contains(num))
			{
				count++;
			}
		}
		if(count>0)
		{
			Iterator<Integer> itr=hm.iterator();
			while(itr.hasNext())
			{
				int i=itr.next();
				int t=num;
				if(t==i && itr.hasNext())
				{
					itr.next();
					if(itr.hasNext())
					{
						System.out.println(itr.next());
					}
					else
					{
						System.out.println("null");
					}
				}
			}
				
		     
		}
		else
		{
			System.out.println(num+" is not present");
		}
	}

}
