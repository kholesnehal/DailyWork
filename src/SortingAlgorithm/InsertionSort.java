package SortingAlgorithm;

public class InsertionSort {

	public static void main(String[] args) {
		int a[]= {34,7,12,78,0,34,78,232};
		
		for(int i=0;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && temp<=a[j])
			{
				a[j+1]=a[j];
				j=j-1;
			}
			a[j+1]=temp;
		}
		System.out.println("printing sorted elemets:");
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]);
	}

}
