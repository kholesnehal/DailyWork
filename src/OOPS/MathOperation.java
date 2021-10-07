package OOPS;

public class MathOperation implements SciCalculator {
	
	public int add(int x,int y)
	{
		return x+y;
	}
	public int multi(int x,int y)
	{
		return x*y;
	}
	

	
	public double findSin(double angle)
	{
		return Math.sin(angle);
	}
	public double findLog(double num)
	{
		return Math.tan(num);
	}

	/*
	 * public double findSqrt(double x) {

	 * System.out.println("This is my overriden version"); 
	 * return Math.sqrt(x);
	 *  }
	 * 
	 * public double findTan(double x) {
	 *  return Math.tan(x);
	 *   }
	 */
	public static void main(String[] args) {
		
		MathOperation o=new MathOperation();
		
		System.out.println("Addition is :"+o.add(34,45));
		System.out.println("Multiplication is:"+o.multi(67,34));
		System.out.println("Sqrt is:"+o.findSqrt(34));
		System.out.println("tan of 0 is:"+SciCalculator.findTan(34));
		System.out.println("sin of 90 is:"+o.findSin(90));
		System.out.println("log of 90 is:"+o.findLog(90));
		
		
		
		
		
	}

}
