package com.bhasker.dgstack.coreprg;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Arrays4 {

	public static void main(String[] args) {
		int a[] = new int[5];

		for (int i = 0; i < 5; i++) {
			a[i] = i;
		}

		List al = Arrays.asList(a);
		Collection c = new ArrayList(al);
		System.out.println(al);

	}

}
