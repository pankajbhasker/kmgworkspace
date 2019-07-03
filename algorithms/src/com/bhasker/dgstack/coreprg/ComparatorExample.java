package com.bhasker.dgstack.coreprg;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet(new MyComparator());

		ts.add("hussain");
		ts.add("chandra");
		ts.add("zebra");
		ts.add("oxo");
		ts.add("pankaj");

		Iterator itr = ts.iterator();

		while (itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}

	}

}

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {
		String str1 = (String) obj1;
		String str2 = (String) obj2;

		return str1.compareTo(str2);

	}
}
