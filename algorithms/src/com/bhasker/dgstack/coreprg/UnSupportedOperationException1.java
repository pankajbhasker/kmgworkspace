package com.bhasker.dgstack.coreprg;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class UnSupportedOperationException1 {

	public static void main(String[] args) {

		int a[] = new int[10];

		for (int i = 0; i < 10; i++)

			a[i] = i;

		List al = Arrays.asList(a);

		al.add(6);
		al.add(7);

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
