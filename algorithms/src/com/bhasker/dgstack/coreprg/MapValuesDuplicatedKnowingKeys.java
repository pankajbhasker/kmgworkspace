package com.bhasker.dgstack.coreprg;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class MapValuesDuplicatedKnowingKeys {

	public static void main(String[] args) {

		Map<Integer, String> m = new ConcurrentHashMap<>();

		m.put(101, "hussain");
		m.put(102, "chandra");
		m.put(103, "hussain");
		m.put(104, "xxx");
		m.put(105, "hussain");
		m.put(106, "hi");
		m.put(107, "hi");
		m.put(101, "hussain");

		// Sorting by keys

		Map<Integer, String> m2 = new HashMap<>();

		for (Integer key : m.keySet()) {
			if (m2.containsValue(m.get(key))) {
				m.remove(key);
			} else {
				m2.put(key, m.get(key));
			}
		}

		for (Integer key : m.keySet()) {
			System.out.println("key is" + " " + key + " value is " + m.get(key));

		}

		// Sorting by values

		System.out.println("\n");

		List<Map.Entry<Integer, String>> list = new LinkedList<Map.Entry<Integer, String>>(m.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<Integer, String>>() {

			@Override
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				return o1.getValue().compareTo(o2.getValue());
			}
		});

		for (Map.Entry<Integer, String> entry : list) {
			System.out.println("key is" + " " + entry.getKey() + " value is " + entry.getValue());

		}

	}

}
