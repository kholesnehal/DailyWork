package Collection;

import java.util.Collections;

public class Train implements Comparable<Train>{
	int id;
	String name;
	int noOfSeat;
	

	public Train(int id, String name, int noOfSeat) {
		super();
		this.id = id;
		this.name = name;
		this.noOfSeat = noOfSeat;
	}


	@Override
	public String toString() {
		return "Train [id=" + id + ", name=" + name + ", noOfSeat=" + noOfSeat + "]";
	}


	public static void main(String[] args) {
	}


	@Override
	public int compareTo(Train o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
