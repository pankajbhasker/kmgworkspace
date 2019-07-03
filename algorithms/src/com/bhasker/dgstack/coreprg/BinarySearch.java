package com.bhasker.dgstack.coreprg;
import java.util.ArrayList;
import java.util.Collections;

public class BinarySearch {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add("hussain");
		al.add("100");
		al.add("chandra");
		al.add("101");
		System.out.println(Collections.binarySearch(al, "chandrasw"));
		// Collections.reverse(al);
		System.out.println(al);

	}

}
