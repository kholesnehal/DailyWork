package OOPS;

public class PrintNoAndChar {
	
	public void form(int n,char c)
	{
		System.out.println(n+ " "+c);
	}
	public void form(char c,int n)
	{
		System.out.println(c+ " "+n);
	}
	public static void main(String[] args) {
		PrintNoAndChar p=new PrintNoAndChar();
		p.form('S', 5);
		p.form(6, 'A');
	}

}
