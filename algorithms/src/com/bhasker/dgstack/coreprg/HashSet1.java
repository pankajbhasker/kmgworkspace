package com.bhasker.dgstack.coreprg;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet hs = new HashSet();

		hs.add("hussain");
		hs.add(101);
		hs.add(null);
		hs.add(null);

		Iterator itr = hs.iterator();

		while (itr.hasNext()) {
			Object o = itr.next();
			System.out.println(o);
		}
	}

}
