package OOPS;

public class Movie {
		private int  mid;
		private String mname;
	 Actor a;
	
	public Movie(int mid, String mname, Actor a) {
			super();
			this.mid = mid;
			this.mname = mname;
			this.a = a;
		}
	public Movie() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Movie [mid=" + mid + ", mname=" + mname + ", a=" + a + "]";
	}

	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Actor getA() {
		return a;
	}
	public void setA(Actor a) {
		this.a = a;
	}




	public static void main(String[] args) {
		//Using constructor
//		Movie m=new Movie(1,"Bhuj",new Actor(101,"Ajay Devagan"));
//		System.out.println(m);
		
		//Using getter Setter
		Movie m1=new Movie();
		m1.setMid(11);
		m1.setMname("guru");
		m1.setA(new Actor());
		m1.getA().setAid(101);
		m1.getA().setAname("vijay");
		System.out.println("Movie name:"+m1.getMname()+"\n"+"Movie id:"+m1.getMid());
		System.out.println("Actor id:"+m1.getA().getAid()+"\n"+"Actor name:"+m1.getA().getAname());
	}

}
class Actor{
	private int aid;
	private String aname;
	public Actor(int aid, String aname) {
		super();
		this.aid = aid;
		this.aname = aname;
	}
	public Actor() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Actor [aid=" + aid + ", aname=" + aname + "]";
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
}