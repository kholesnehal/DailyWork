package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DecendingOrderOfQueue {

	public static void main(String[] args) {
		Queue<Integer>pq=new PriorityQueue<>(new MyDemo());
		pq.add(5);
		pq.add(9);
		pq.add(4);
		pq.add(1);
		pq.add(7);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
	}

}
class MyDemo implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2-o1;
	}
	
}