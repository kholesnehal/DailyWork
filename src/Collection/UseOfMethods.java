package Collection;

import java.util.ArrayList;

public class UseOfMethods {

	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		list.add("snehal");
		list.add("Samina");
		list.add("manu");
		list.add("sonali");
		list.add("monika");
		list.add("chaitali");
		
		ArrayList<String>list1=new ArrayList<>();
		list1.add("komal");
		list1.add("bharati");
		list1.add("Dipti");
		list1.add("chaitali");
		
		//addAll()
		list1.addAll(list);
		System.out.println(list1);
		
		//size()
		System.out.println(list.size());
		
		//isEmpty()
		System.out.println(list1.isEmpty());
		
		//indexOf()
		System.out.println(list.indexOf("manu"));
		
		//contains()
		System.out.println(list.contains("snehal"));
		
		//retainall()
		System.out.println(list1.retainAll(list1));
		
		//removeall()
		System.out.println(list1.removeAll(list1));
		
	}

}
