package Collection;

import java.util.ArrayList;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Employee1 implements Comparable<Employee1>{
	int id;
	String name;
	int salary;
	

	public Employee1(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	//Using comparable
	public int compareTo(Employee1 o)
	{
		return this.id-o.id;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeMap<Employee1,Integer>tm=new TreeMap<Employee1,Integer>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id: ");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter salary:");
			int salary=sc.nextInt();
			tm.put(new Employee1(id,name,salary),salary);
		}
		for(Entry<Employee1, Integer> e:tm.entrySet())
		{
			System.out.println(e.getKey()+"="+e.getValue());

		}

	}



}
