package TwoDArray;

public class ArrayUsingEnhanceForLoop {

//	private static Object a1;

	public static void main(String[] args) {
		
		int a[][]={{1,2,3},{3,4,5},{3,7,5}};
//		int b[][]= {{4,5,7},{3,7,8},{8,6,4}};
		for(int x[]:a)
		{
			for(int y:x)
			{
				System.out.print(y+" ");
			}
			System.out.println();
		}
			
	}

}
