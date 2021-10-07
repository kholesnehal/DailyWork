package Collection;

import java.util.Comparator;

public class ItemPriceComparable implements Comparator<Item> {


	@Override
	public int compare(Item o1, Item o2) {
		if(o1.itemPrice>o2.itemPrice)
			return 1;
		if(o1.itemPrice<o2.itemPrice)
			return -1;
		return 0;
	}


}
