package OOPS;

public class Area {
	
	public void area(int s)
	{
		int a=s*s;
		System.out.println("Area of square is:"+a);
	}
	public void area(int l,int b)
	{
		int a=l*b;
		System.out.println("Area of rectangle is:"+a);
	}

	public static void main(String[] args) {
		Area a=new Area();
		a.area(4);
		a.area(45, 7);
	}

}
