package Collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Emp {
	int id;
	String name;
	

	public Emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}
	public int hashCode()
	{
		return id;
		}
		
		public boolean equals(Object o)
		{
			Emp e=(Emp) o;
			if(this.id==e.id)
			{
				if(this.name.equals(e.name))
					return true;
			}
		
			return false;
		}


	public static void main(String[] args) {
		LinkedHashMap<Emp,Integer>m=new LinkedHashMap<>();
		m.put(new Emp(5,"snehal"), 16);
		m.put(new Emp(5,"snehal"), 16);
		m.put(new Emp(3,"samina"), 13);
		m.put(new Emp(4,"rohini"), 14);
	
	for(Entry<Emp, Integer> d:m.entrySet())
	{
		System.out.println("key:"+d.getKey()+"Value:"+d.getValue());
	}
	//Using Collection
	Collection<Integer> list = m.values();
	for (Integer i : list)
		System.out.println(i);
	
	//Using iterator
	Set<Map.Entry<Emp, Integer>> ss=m.entrySet();
	Iterator it=ss.iterator();
	while(it.hasNext())
	{
		Map.Entry<Emp, Integer>i=(Entry<Emp, Integer>) it.next();
		System.out.println("Key  ="+i.getKey()+" Value ="+i.getValue());
		
	}
}
}