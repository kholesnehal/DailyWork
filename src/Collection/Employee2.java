package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee2 {
	int id;
	String name;
	int salary;
	

	public Employee2(int id, String name, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	public static void main(String[] args) {
		
		ArrayList<Employee2> emp=new ArrayList();
		emp.add(new Employee2(101,"Snehal",2000));
		emp.add(new Employee2(102,"khole",300));
		System.out.println(emp);
		
		//for each loop
		System.out.println("Using for each loop");
		for(Employee2 e:emp)
		{
			System.out.println(e.id+" "+e.name+" "+e.salary);
		}
		//using traditional for loop
		System.out.println("using traditional for loop");
		for(int i=0;i<emp.size();i++)
		{
			System.out.println(emp.get(i).id+" "+emp.get(i).name+" "+emp.get(i).salary);
		}
		
		//by using iterator
		System.out.println("By using iterator");
		Iterator<Employee2> itr=emp.iterator();
		while(itr.hasNext())
		{
			Employee2 ee=itr.next();
			System.out.println(ee.id+" "+ee.name+" "+ee.salary);
		}

	}

}
