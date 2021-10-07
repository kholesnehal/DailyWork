package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingItem {

	public static void main(String[] args) {
		
		List<Item> itemlist=new ArrayList<>();
		System.out.println(itemlist);
		itemlist.add(new Item(6354,7771.45f,"Pendrive"));
		itemlist.add(new Item(2434,8453.45f,"Bluetooh"));
		itemlist.add(new Item(7512,5756.45f,"Smart "));
		itemlist.add(new Item(5654,7342.45f,"Apple"));
		itemlist.add(new Item(4532,2334.45f,"Head phone"));
		System.out.println("Before sorting item list");
		
		for(Item it:itemlist)
		{
		System.out.println(it);	
		}
		System.out.println("___________________________________");
		
		//1.Sorting by itemId in ascending order
		Collections.sort(itemlist);
		System.out.println("After sorting item list by ascending order");
		for(Item it:itemlist)
		{
			System.out.println(it);
		}
		System.out.println("_____________________________________");
		
		//2.Sorting by itemPrice in ascending order
		Collections.sort(itemlist,new ItemPriceComparable());
		System.out.println("After sorting item list by ascending order");
		for(Item it:itemlist)
		{
			System.out.println(it);
		}
		
	}

}
