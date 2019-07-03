package com.bhasker.dgstack.coreprg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeSet;

public class TreesetSorting {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("hussain");
		al.add("chandra");
		al.add("java");
		al.add("struts");
		al.add("hussain");

		TreeSet ts = new TreeSet(al);

		Iterator itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}