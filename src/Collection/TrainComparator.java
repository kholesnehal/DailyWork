package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TrainComparator {

	public static void main(String[] args) {
		List<Train> list=new ArrayList<>();
//		System.out.println(list);
		list.add(new Train(1,"ABC",10));
		list.add(new Train(2,"XYZ",5));
		list.add(new Train(3,"DEF",5));
		list.add(new Train(4,"PQR",12));
		
//		Collections.sort(list,new TrainComparable());
//		System.out.println("After sorting train by ascending order");
//		for(Train it:list)
//		{
//			System.out.println(it);
//		}
		
		Collections.sort(list,new TrainComparable());
		for(Train t:list)
		{
			System.out.println(t);
		}
		
	
	}
}
