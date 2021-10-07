package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency {

	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<>();
		str.add("Apple");
		str.add("Apple");
		str.add("Apple");
		str.add("Mango");
		str.add("Mango");
		str.add("Banana");
		str.add("Apple");
		str.add("Papaya");

		HashMap<String, Integer> m = new HashMap<>();
		for (int i=0; i<str.size();i++) {
			boolean f = false;
			int count = 1;
			for (int k=i-1; k>=0; k--) {
				if (str.get(i).equals(str.get(k))) {
					f = true;
					break;
				}
			}
			if (f == false) {
				for (int j =i+1; j<str.size(); j++) {
					if (str.get(i).equals(str.get(j))) {
						count++;
					}
					m.put(str.get(i), count);
				}
			}
		}
		for (Map.Entry<String, Integer> e : m.entrySet()) {
			System.out.println(e.getKey() + "=" + e.getValue());

		}

	}

}
