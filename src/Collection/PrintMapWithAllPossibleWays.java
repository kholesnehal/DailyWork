package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class PrintMapWithAllPossibleWays {

	public static void main(String[] args) {
		
		HashMap<Integer,String> m=new HashMap<>();
		m.put(23, "Snehal");
		m.put(45, "Monika");
		m.put(89, "Bharati");
		m.put(47, "Chaitali");
		m.put(33, "Arti");
		m.put(100, "Akshada");
		
		//way 1:
		System.out.println(m);
		
		//Using collection by value
		Collection list=m.values();
		Iterator<String>itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		//Using iterator
		System.out.println("Iterate map using iterator");
		Set<Map.Entry<Integer, String>> s=m.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry<Integer, String>i=(Entry<Integer, String>) it.next();
			System.out.println("Key  ="+i.getKey()+" Value ="+i.getValue());
			
		}
		//Using Map entry
		Set<Map.Entry<Integer,String>> entry=m.entrySet();
		for(Map.Entry<Integer,String>e:entry)
		{
			System.out.println(e.getKey()+"="+e.getValue());
	}

}
}