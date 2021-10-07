package Collection;

public class Item implements Comparable<Item> {
	int itemid;
	float itemPrice;
	String itemName;
	
	 public Item()
	 {}
	

	public Item(int itemid, float itemPrice, String itemName) {
		super();
		this.itemid = itemid;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
	}


	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", itemPrice=" + itemPrice + ", itemName=" + itemName + "]";
	}


	public static void main(String[] args) {
		
	}


	@Override
	public int compareTo(Item o) {
		if(this.itemid>o.itemid)
			return 1;
		else if(this.itemid<o.itemid)
			return -1;
		return 0;
	}



}
