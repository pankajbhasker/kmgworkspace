package com.bhasker.dgstack.coreprg;
import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(101);
		v.add("hussain");
		v.addElement("chandra");
		v.add(102);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			Object o = e.nextElement();
			System.out.println(o);
		}

	}

}