package com.bhasker.dgstack.coreprg;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TreeMap1 {

	public static void main(String[] args) {

		HashMap tm = new HashMap();
		tm.put("1", "driver");
		tm.put("s1", "url");
		tm.put("s2", "pwd");

		Set s = tm.entrySet();

		Iterator itr = s.iterator();

		while (itr.hasNext()) {
			Object o = itr.next();
			Map.Entry me = (Map.Entry) o;
			Object key = me.getKey();
			Object value = me.getValue();
			System.out.println(key + " " + value);
		}

		System.out.println();
		System.out.println();

		// Displaying the keys
		Set s1 = tm.keySet();

		Iterator itr1 = s1.iterator();

		while (itr1.hasNext()) {
			Object o = itr1.next();
			System.out.println(o);
		}

		System.out.println();

		// Displaying the values

		Set s2 = tm.entrySet();

		Iterator itr2 = s2.iterator();
		while (itr2.hasNext()) {
			Object o = itr2.next();
			Map.Entry me1 = (Map.Entry) o;
			System.out.println(me1.getValue());
			System.out.println(me1.getKey());

		}
	}

}
