package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Student1 {
	int id;
	String name;
	int marks;
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}


	public static void main(String[] args) {
		ArrayList<Student1> s1=new ArrayList<Student1>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter marks:");
			int marks=sc.nextInt();
			Student1 ss=new Student1();
			ss.setId(id);
			ss.setName(name);
			ss.setMarks(marks);
			s1.add(ss);
		}
		System.out.println("Using for each");
		for(Student1 s2:s1)
		{
			System.out.println(s2.getId()+" "+s2.getName()+" "+s2.getMarks());
		}
		
		System.out.println("Using traditional method");
		for(int i=0;i<s1.size();i++)
		{
			System.out.println(s1.get(i).getId()+" "+s1.get(i).getName()+" "+s1.get(i).getMarks());
		}
		
		System.out.println("By using iterator");
		Iterator<Student1> itr=s1.iterator();
		while(itr.hasNext())
		{
			Student1 ee=itr.next();
			System.out.println(ee.id+" "+ee.name+" "+ee.marks);
		}
	}

}
