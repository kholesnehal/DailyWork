package Collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("Snehal", 90);
		hm.put("Samina", 80);
		hm.put("Manu", 94);
		hm.put("Siya", 86);

		System.out.println(hm.get("Snehal"));
		System.out.println(hm.containsKey("Manu"));
		System.out.println(hm.containsValue(80));
		System.out.println(hm.isEmpty());
		System.out.println(hm.size());

		Set<String> kk = hm.keySet();
		for (String s : kk)
			System.out.println(s + "=" + hm.get(s));

		Set<Entry<String, Integer>> ee = hm.entrySet();
		for (Entry<String, Integer> e : ee) {
			System.out.println(e.getKey() + "-->" + e.getValue());
		}

		Collection<Integer> list = hm.values();
		for (Integer i : list)
			System.out.println(i);
	}

}
