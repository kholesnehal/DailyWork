package OOPS;

public class Student {
	private int sid;
	private String sname;
	private long moNo;
	private int passoutyr;
	private CompanyTraining ct;
	

	public Student(int sid, String sname, long moNo, int passoutyr, CompanyTraining ct) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.moNo = moNo;
		this.passoutyr = passoutyr;
		this.ct = ct;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", moNo=" + moNo + ", passoutyr=" + passoutyr + ", ct=" + ct
				+ "]";
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public long getMoNo() {
		return moNo;
	}


	public void setMoNo(long moNo) {
		this.moNo = moNo;
	}


	public int getPassoutyr() {
		return passoutyr;
	}


	public void setPassoutyr(int passoutyr) {
		this.passoutyr = passoutyr;
	}


	public CompanyTraining getCt() {
		return ct;
	}


	public void setCt(CompanyTraining ct) {
		this.ct = ct;
	}
public Student() {
	// TODO Auto-generated constructor stub
}

	public static void main(String[] args) {
		//Using constructor
		Student s=new Student(1,"Snehal",1234567890,2020,new CompanyTraining(11,"Perennial",new Trainner(101,"prof.deepa")));
		System.out.println(s);
		
		//Using getter setter
		Student s1=new Student();
		s1.setSid(22);
		s1.setSname("Manu");
		s1.setMoNo(475643625532l);
		s1.setPassoutyr(2020);
		s1.setCt(new CompanyTraining());
		s1.getCt().setCid(101);
		s1.getCt().setCname("Perennial");
		s1.getCt().setT(new Trainner());
		s1.getCt().getT().setTid(100);
		s1.getCt().getT().setTname("Prof.deepa");
		System.out.println("Stud name:"+s1.getSname()+"\n"+"Stud id:"+s1.getSid()+"\n"+"Mo no:"+s1.getMoNo()+"\n"+"passout year:"+s1.getPassoutyr());
		System.out.println("company id:"+s1.getCt().getCid()+"\n"+"comapny name:"+s1.getCt().getCname());
		System.out.println("trainner id:"+s1.getCt().getT().getTid()+"\n"+"trainner name:"+s1.getCt().getT().getTname());
	}

}
class CompanyTraining
{
	private int cid;
	private String cname;
	private Trainner t;
	public CompanyTraining(int cid, String cname, Trainner t) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.t = t;
	}
	@Override
	public String toString() {
		return "CompanyTraining [cid=" + cid + ", cname=" + cname + ", t=" + t + "]";
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Trainner getT() {
		return t;
	}
	public void setT(Trainner t) {
		this.t = t;
	}
	
	public CompanyTraining() {
		// TODO Auto-generated constructor stub
	}
	
	
	}
class Trainner
{
	private int tid;
	private String tname;
	public Trainner(int tid, String tname) {
		super();
		this.tid = tid;
		this.tname = tname;
	}
	@Override
	public String toString() {
		return "Trainner [tid=" + tid + ", tname=" + tname + "]";
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	
	public Trainner() {
		// TODO Auto-generated constructor stub
	}
	}