package com.bhasker.dgstack.coreprg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class DeletingDuplicatesInAL {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		al.add(101);
		al.add(102);
		al.add(101);
		al.add(103);
		al.add(101);
		al.add(104);

		ArrayList al1 = new ArrayList();

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			Object o = itr.next();
			if (al1.contains(o))
				itr.remove();
			else
				al1.add(o);
		}
		System.out.println(al1);

	}

}
