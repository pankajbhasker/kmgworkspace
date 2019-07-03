package com.bhasker.dgstack.coreprg;


import java.util.Iterator;
import java.util.TreeSet;

public class ClassObjectToHashSet {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		/*
		 * set.add(101); set.add(102); set.add(103); set.add(104);
		 */
		// set.add(101);

		Student1 s = new Student1();
		set.add(s);

		Iterator itr = set.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();

			if (obj.equals(s))
				((Student1) s).m1();
			else
				System.out.println(obj);
		}

	}

}

class Student1 {
	int num = 10;
	String str = "hussain";
	int marks = 100;

	public void m1() {
		System.out.println(num + "   " + str + "    " + marks);
	}
}
