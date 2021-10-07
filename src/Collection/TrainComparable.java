package Collection;

import java.util.Comparator;

public class TrainComparable implements Comparator<Train> {

	@Override
//	public int compare(Object o1, Object o2) {
//		if(o1.noOfSeat>o2.noOfSeat)
//			return 1;
//		if(o1.noOfSeat<o2.noOfSeat)
//			return -1;
//		return 0;
//	}

	public int compare(Train o1, Train o2) {
		if(o1.noOfSeat>o2.noOfSeat)
			return 1;
		if(o1.noOfSeat<o2.noOfSeat)
			return -1;
		else
			
		return o1.name.compareTo(o2.name);
	}

}
