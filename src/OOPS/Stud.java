package OOPS;

public class Stud {
	String name;
	int age; 
	String address;
	
	public void set_info(String name,int age)
	{
		System.out.println("name:"+name);
		System.out.println("Age:"+age);
	}
	public void set_info(String name,int age,String address)
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Address:"+address);
	}

	public static void main(String[] args) {
		Stud s=new Stud();
		s.set_info("Snehal", 22);
		s.set_info("manu", 20, "Pune");
	}

}
