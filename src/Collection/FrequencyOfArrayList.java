package Collection;

import java.util.ArrayList;
import java.util.Arrays;

public class FrequencyOfArrayList {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("pune");
		list.add("nagar");
		list.add("nagar");
		list.add("pune");
		list.add("mumbai");
		System.out.println(list);
		
		for(int i=0;i<list.size();i++)
		{
			int count=1;
			boolean visited=false;
			for(int k=i-1;k>=0;k--)
			{
				if(list.get(i)==list.get(k))
				{
					visited=true;
					break;
				}
			}
			if(visited==false)
			{
				for(int j=i+1;j<list.size();j++)
				{
					if(list.get(i)==list.get(j))
						count++;
				}
				System.out.println(list.get(i)+" = "+count);
		
	}
		
		}
		
	}
		}
