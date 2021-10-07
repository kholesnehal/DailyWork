package Collection;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapWithDesendingOrder {

	public static void main(String[] args) {
		TreeMap<Integer,String>tm=new TreeMap<>(new MyClass());
		tm.put(19, "java");
		tm.put(67, "python");
		tm.put(89, "scala");
		tm.put(45, "mysql");
		tm.put(11, "neo4j");
		System.out.println(tm);
	
		NavigableSet<Integer>rev=tm.descendingKeySet();
		for(Integer s:rev)
		{
			System.out.println(s+"="+tm.get(s));
		}
	}

}
class MyClass implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o1-o2;
	}
	

}