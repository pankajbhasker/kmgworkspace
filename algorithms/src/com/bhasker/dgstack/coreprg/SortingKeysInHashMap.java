package com.bhasker.dgstack.coreprg;
import java.util.HashMap;
import java.util.Map;

public class SortingKeysInHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(105, "hussain");
		hm.put(104, "chandra");
		hm.put(103, "java");
		hm.put(102, "hyd");
		hm.put(101, "seena");
		hm.put(101, "seena");

		Map<Integer, String> m2 = new HashMap<>();

		for (Integer key : hm.keySet()) {
			if (m2.containsValue(hm.get(key))) {
				hm.remove(key);
			} else {
				m2.put(key, hm.get(key));
			}
		}

		for (Integer key : hm.keySet()) {

			System.out.println("key is" + " " + hm.get(key) + " value is " + key);

		}
	}
}
