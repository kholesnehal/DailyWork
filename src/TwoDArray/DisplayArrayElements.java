//Q:1

package TwoDArray;

public class DisplayArrayElements {

	public static void main(String[] args) {
		
		int a[][]= {{1,2,3},{4,6,3},{6,9,7}};
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
			System.out.print(a[i][j]+" ");
		}
			System.out.println();
		}
	}

}
