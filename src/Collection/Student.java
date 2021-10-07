package Collection;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map.Entry;

public class Student {
	int id;
	String name;
	Course s;
	
	public Student(int id, String name, Course s) {
		super();
		this.id = id;
		this.name = name;
		this.s = s;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", s=" + s + "]";
	}
	
	@Override
	public int hashCode() {
		return this.s.cid;
	}

	@Override
	public boolean equals(Object obj) {
		Student stud=(Student) obj;
		if(this.s.cid==stud.s.cid)
			return true;
		return false;
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashMap<Student,Integer>m=new LinkedHashMap<>();
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id:");
			int id=sc.nextInt();
			System.out.println("Enter name:");
			String name=sc.next();
			System.out.println("Enter cid:");
			int cid=sc.nextInt();
			System.out.println("Enter cname:");
			String cname=sc.next();
			Student e=new Student(id,name,new Course(cid,cname));
			m.put(e, e.id);
		}
		for(Entry<Student, Integer> d:m.entrySet())
		{
			System.out.println("key:"+d.getKey()+"Value:"+d.getValue());
		}
	}

}
class Course
{
	int cid;
	String cname;
	public Course(int cid, String cname) {
		super();
		this.cid = cid;
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname + "]";
	}
	
}
