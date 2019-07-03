package com.bhasker.dgstack.coreprg;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		
		TreeSet ts = new TreeSet();
		ts.add("xdfhhj");
		ts.add(null);
		ts.add("hussain");
		ts.add("chandra");

		Iterator itr = ts.iterator();

		while (itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
			//System.out.println(o);
		}

	}

}
