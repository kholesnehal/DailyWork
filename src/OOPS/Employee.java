package OOPS;

public class Employee {

	private int eid;
	private String ename;
	private int salary;
	private Department d;
	
	
	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public int getSalary() {
		return salary;
	}


	public void setSalary(int salary) {
		this.salary = salary;
	}


	public Department getD() {
		return d;
	}


	public void setD(Department d) {
		this.d = d;
	}


	public static void main(String[] args) {
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("Snehal");
		e.setSalary(30000);
		e.setD(new Department());
		e.getD().setDid(101);
		e.getD().setDname("Sales");
		System.out.println("Emp id:"+e.getEid()+"\n"+"Emp name:"+e.getEname()+"\n"+"Emp salary:"+e.getSalary()+"\n"+"dept id:"+e.getD().getDid()+"\n"+"Dept name:"+e.getD().getDname());
		
	}

}
class Department
{
	private int did;
	private String dname;
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
	}
