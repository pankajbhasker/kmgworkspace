package com.bhasker.dgstack.coreprg;
import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSet1 {

	public static void main(String[] args) {
		NavigableSet ns = new TreeSet();

		ns.add(101);
		ns.add(102);
		ns.add(103);
		ns.add(110);
		ns.add(120);

		System.out.println(ns.floor(110));

	}

}
