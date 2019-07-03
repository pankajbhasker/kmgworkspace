package com.bhasker.dgstack.coreprg;

public class FizzBizz {

	public static void main(String[] args) {

		for (int i = 1; i <= 50; i++) {
			if (i % (3 * 5) == 0) {
				System.out.println("Fizzbuzz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else if (i % 3 == 0) {
				System.out.println("FIzz");
			} else
				System.out.println(i);
		}
	}

}
