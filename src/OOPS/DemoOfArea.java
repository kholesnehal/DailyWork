package OOPS;


abstract class Shape
{
	abstract public void area(int l,int b);
	
public void display()
{
System.out.println("In display method");	
}


}
class Rectangle extends Shape
{
public void area(int l,int b)
{
	int a=l*b;
	System.out.println("Area of rectangle:"+a);

}


}


public class DemoOfArea {

	public static void main(String[] args) {
		/*
		 * Shape s=new Rectangle();
		 *  s.area(2, 22);
		 *   s.display(); 
		 */      
		Rectangle r=new Rectangle();
        r.area(2, 22);
       r.display();
	}

}
