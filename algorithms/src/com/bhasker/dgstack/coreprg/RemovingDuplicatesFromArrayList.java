package com.bhasker.dgstack.coreprg;
import java.util.ArrayList;
import java.util.Iterator;

public class RemovingDuplicatesFromArrayList {
	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();

		al.add("hussain");
		al.add("chandra");
		al.add(101);
		al.add("chandra");
		al.add("mahaboob");
		al.add(101);
		al.add(102);
		al.add('c');
		al.add(102);
		al.add("hussain");

		ArrayList al2 = new ArrayList();
		// System.out.println(al2.size());

		Iterator it = al.iterator();

		while (it.hasNext()) {
			Object o = it.next();

			if (al2.contains(o))
				it.remove();
			else
				al2.add(o);

			/*
			 * if(al2.size()==0) al2.add(o); else { if(al2.contains(o)) it.remove(); else
			 * al2.add(o); }
			 */
		}
		System.out.println(al2);

	}

}
