package Collection;

import java.util.*;
import java.util.Collections;

public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(56);
		list.add(45);
		list.add(32);
		list.add(67);
		list.add(59);
		list.add(22);
		System.out.println(list);
//		Collections.sort(list);
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i)<list.get(j))
				{
					int temp=list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
					
			}
		}
	}
		for(Integer s:list)
		{
			System.out.print(s+" ");
		}
	}
}
