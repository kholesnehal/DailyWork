package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class MapWhichContainAnotherMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> m=new HashMap<>();
//		m.put("Java", 1);
//		m.put("c", 2);
//		m.put("python", 3);
//		m.put("scala", 4);
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter key as string:");
			String str=sc.next();
			System.out.println("Enter value as a integer:");
			int val=sc.nextInt();
			m.put(str, val);
		}
		HashMap<Integer,HashMap<String,Integer>>m1=new HashMap<>();
		m1.put(11, m);
		m1.put(12, m);
		m1.put(13, m);
		m1.put(14, m);
		
		System.out.println(m1);
		
		//using map entry
				Set<Entry<Integer, HashMap<String, Integer>>> entry=m1.entrySet();
				for(Entry<Integer, HashMap<String, Integer>> e:entry)
				{
					System.out.println(e.getKey()+"="+e.getValue());
			}
				
				
				System.out.println("Iterate map using iterator");
				Set<Entry<Integer, HashMap<String, Integer>>> s=m1.entrySet();
				Iterator it=s.iterator();
				while(it.hasNext())
				{
					Map.Entry<Integer, String>i=(Entry<Integer, String>) it.next();
					System.out.println("Key  ="+i.getKey()+" Value ="+i.getValue());
					
				}
				
		
	}

}
