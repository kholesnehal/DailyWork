package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Employee {
	int id;
	String name;
	

	public Employee(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
public int hashCode()
{
	return id;
	}
	
	public boolean equals(Object o)
	{
		Employee e=(Employee) o;
		if(this.id==e.id)
		{
			return true;
		}
		else
		{
			return false;
		}
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<Employee,Integer>m=new LinkedHashMap<>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			Employee e=new Employee(id,name);
			m.put(e, e.id);
		}
//		Set<Employee>st=m.keySet();
//		Iterator<Employee>itr=st.iterator();
//		while(itr.hasNext())
//		{
//			Employee key=itr.next();
//			Integer str=m.get(key);
//			Set<Employee>st1=m.keySet();
//			Iterator<Employee>itr1=st1.iterator();
//			while(itr1.hasNext())
//			{
//				Employee key1=itr1.next();
//				Integer str1=m.get(key1);
//				if(str==str1)
//				{
//					m.remove(key1);
//					System.out.println(str);
//					
//				}
//			}
			
//		}
//		m.put(e,key1);
		for(Entry<Employee, Integer> d:m.entrySet())
		{
			System.out.println("key:"+d.getKey()+"Value:"+d.getValue());
		}
	}

}
