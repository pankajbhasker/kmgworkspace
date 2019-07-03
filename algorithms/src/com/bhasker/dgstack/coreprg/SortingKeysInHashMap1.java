package com.bhasker.dgstack.coreprg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class SortingKeysInHashMap1 {

	public static void main(String[] args) {

		HashMap hm = new HashMap();

		hm.put(105, "hussain");
		hm.put(104, "chandra");
		hm.put(103, "java");
		hm.put(102, "sathya");
		hm.put(101, "sekhar");

		ArrayList al = new ArrayList();
		int i = 0;

		Set set = hm.keySet();

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Object obj1 = itr.next();
			al.add(obj1);

		}

		Iterator it = al.iterator();

		while (it.hasNext()) {
			Object o = it.next();
			System.out.println("key is: " + o + " value is: " + hm.get(o));
		}

	}

}
